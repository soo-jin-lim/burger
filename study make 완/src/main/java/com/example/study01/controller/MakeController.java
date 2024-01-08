package com.example.study01.controller;

import com.example.study01.config.RootConfig;
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
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @GetMapping("/makeList")
    public void makelist(@PageableDefault(size = 1) Pageable pageable, Model model) {
        Page<MakeEntity> makelist = makeService.makelist(pageable);
        List<MakeEntity> ml = makelist.getContent();

        Map<MakeEntity, String> totalList = new HashMap<>();

        model.addAttribute("makeAll", totalList);


        model.addAttribute("makelist", makelist);
    }

    @PostMapping("/makeRegister")
    public String makeNew(@Valid @ModelAttribute MakeDTO makeDTO, Model model, RedirectAttributes regs) {
        log.info(makeDTO);
        Long sid = makeService.saveMake(makeDTO);
        log.info(sid);
        regs.addFlashAttribute("msg","생성 성공");

        return "redirect:/study/make";
    }

    @GetMapping("/make")
    public void makeForm() {

    }
    @PostMapping("/modify")
    public String modify(@Valid MakeDTO makeDTO,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes) {

        log.info("board modify post......." + makeDTO);

        if (bindingResult.hasErrors()) {
            log.info("has errors.......");
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors());
            redirectAttributes.addAttribute("bno", makeDTO.getSid());
            return "redirect:/study/modify";
        }
        makeService.modify(makeDTO);
        return "redirect:/study/view?sid="+makeDTO.getSid();
    }

    @GetMapping("/studylist")
    public void list(Model model, @PageableDefault(size=5,sort="sid",
    direction = Sort.Direction.DESC)Pageable pageable){
        Page<MakeEntity> pageMake=makeService.makelist(pageable);
        List<MakeEntity> makeEntities=pageMake.getContent();
        model.addAttribute("makeList",makeEntities);
        model.addAttribute("pageMake",makeService.makelist(pageable));


    }

  @GetMapping({"/view","/modify"})
    public void view(@RequestParam("sid") Long sid, Model model){
        log.info("페이지를 이동합니다.");
        MakeDTO makeDTO = makeService.getmake(sid);
        model.addAttribute("makedto",makeDTO);
  }

  @GetMapping("/remove")
    public String remove(Long sid){
        makeService.remove(sid);
        return "redirect:/study/studylist";
  }



}