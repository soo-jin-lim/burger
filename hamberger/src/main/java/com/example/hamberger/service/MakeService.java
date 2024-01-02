package com.example.hamberger.service;

import com.example.hamberger.Repository.MakeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MakeService {
    private final MakeRepository makeRepository;
//    public int make(MakeDTO makeDTO) {
//        return makeRepository.make(makeDTO);
//    }
}
