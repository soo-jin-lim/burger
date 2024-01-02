package com.example.hamberger.service;

import com.example.hamberger.Repository.MakeRepository;
import com.example.hamberger.domain.StudyEntity;
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

    // 필요에 따라 다양한 메서드를 추가할 수 있습니다.
}
