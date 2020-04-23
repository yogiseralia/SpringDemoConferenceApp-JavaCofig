package com.demo.service;

import com.demo.model.Speaker;
import com.demo.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;

    // added to perform constructor injection
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    // this setter used in above code snippet to resolve the dependency
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }
}