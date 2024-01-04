package com.example.hamberger.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequiredArgsConstructor
@Log4j2
//@RequestMapping("/study")
public class StudyController {

    @GetMapping("/about")
    public String register(){
        return "about";
    }
    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }

    @GetMapping("/book")
    public String book(){
        return "book";
    }

}