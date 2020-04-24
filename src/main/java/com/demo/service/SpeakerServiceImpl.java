package com.demo.service;

import com.demo.model.Speaker;
import com.demo.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository speakerRepository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constr. called");
    }

    // added to perform constructor injection
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImpl one args constr. called");
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    @Autowired
    // this setter used in above code snippet to resolve the dependency
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl setter called");
        this.speakerRepository = speakerRepository;
    }
}