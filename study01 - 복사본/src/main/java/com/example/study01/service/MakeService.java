package com.example.study01.service;

import com.example.study01.dto.MakeDTO;
import com.example.study01.dto.MediaFormDTO;
import com.example.study01.entity.MakeEntity;
import com.example.study01.entity.MediaImg;
import com.example.study01.entity.MediaInfo;
import com.example.study01.repository.MakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Service
public class MakeService {
    @Autowired
    private MakeRepository makeRepository;


    public List<MakeEntity> getList(){

        return makeRepository.findAll();
}
    public Page<MakeEntity> makelist(Pageable pageable) {

        return makeRepository.findAll(pageable);
    }


    }



