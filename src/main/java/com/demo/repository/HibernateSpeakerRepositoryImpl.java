package com.demo.repository;

import com.demo.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> list = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Yogesh");
        speaker.setLastName("Seralia");

        list.add(speaker);
        return list;
    }
}
