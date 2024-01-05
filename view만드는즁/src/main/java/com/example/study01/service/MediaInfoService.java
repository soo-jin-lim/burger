package com.example.study01.service;

import com.example.study01.entity.MediaInfo;
import com.example.study01.repository.MediaImgRepository;
import com.example.study01.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaInfoService {
    @Autowired
    private MediaRepository mediaRepository;

    @Autowired
    private MediaImgRepository mediaImgRepository;


    public List<MediaInfo> getList(){

        return mediaRepository.findAll();
    }

    public Page<MediaInfo> medialist(Pageable pageable) {

        return mediaRepository.findAll(pageable);


    }


}


