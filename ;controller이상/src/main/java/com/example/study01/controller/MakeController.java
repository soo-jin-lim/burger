package com.example.study01.controller;

import com.example.study01.dto.MakeDTO;
import com.example.study01.dto.MediaFormDTO;
import com.example.study01.entity.MakeEntity;
import com.example.study01.entity.MediaInfo;
import com.example.study01.repository.MakeRepository;
import com.example.study01.service.MakeService;
import com.example.study01.service.MediaInfoService;
import com.example.study01.service.MediaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
@Controller
@RequiredArgsConstructor
@RequestMapping("/study")
public class MakeController {


    private final MakeService makeService;

    @GetMapping("/make")
    public void makelist(@PageableDefault(size = 8) Pageable pageable, Model model) {
        Page<MakeEntity> makelist = makeService.makelist(pageable);
        List<MakeEntity> ml = makelist.getContent();

        Map<MakeEntity, String> totalList = new HashMap<>();

        model.addAttribute("mediaAll", totalList);


        model.addAttribute("makelist", makelist);
    }
//    @GetMapping("/makeRegister")
//    public String makeRegister(Model model) {
//        model.addAttribute("makeDTO", new MakeDTO());
//        return "/study/makeRegister";
//    }

    @PostMapping("/makeRegister")
    public String MakeNew(@Valid MakeDTO makeDTO,
                           BindingResult bindingResult, Model model) {
        log.info("11111111111111111111111111111111111111111111111111111111111111111111111");

        log.info(makeDTO+"@@@@@@@@@@@@@@");
        if (bindingResult.hasErrors()) {
            return "/study/make";
        }

        try {
            makeService.saveMake(makeDTO);

        } catch (Exception e) {
            model.addAttribute("errorMessage", "등록 중 에러가 발생하였습니다.");
            return "/study/makeRegister";
        }

        return "redirect:/study/makelist";
    }

}
