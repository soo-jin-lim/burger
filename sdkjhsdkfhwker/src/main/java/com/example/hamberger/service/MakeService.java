package com.example.hamberger.service;

import com.example.hamberger.Repository.MakeRepository;
import com.example.hamberger.domain.StudyEntity;
import com.example.hamberger.dto.MakeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MakeService {

    private final MakeRepository studyRepository;

    @Autowired
    public MakeService(MakeRepository studyRepository) {
        this.studyRepository = studyRepository;
    }

    public void register(StudyEntity studyEntity) {
        studyRepository.save(studyEntity);
    }


}
