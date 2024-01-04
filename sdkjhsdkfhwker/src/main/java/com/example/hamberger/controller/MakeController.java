package com.example.hamberger.controller;

import com.example.hamberger.domain.StudyEntity;
import com.example.hamberger.dto.MakeDTO;
import com.example.hamberger.service.MakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/make")
public class MakeController {

    private final MakeService makeService;

    @Autowired
    public MakeController(MakeService makeService) {
        this.makeService = makeService;
    }

    @GetMapping("/form")
    public String getMakePage(Model model) {
        model.addAttribute("makeDTO", new MakeDTO());
        return "make/form"; // Return the path to your form template
    }

    @PostMapping("/register")
    public String register(@Valid MakeDTO makeDTO,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("errors", bindingResult.getAllErrors());
            return "redirect:/make/form";
        }


        return "redirect:/make";
    }
}


