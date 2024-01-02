package com.example.hamberger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MakeController {

    @GetMapping("/make")
    public String getMakePage(Model model) {
        // 여기에서 모델에 필요한 데이터를 추가할 수 있습니다.
        return "make"; // "make.html" 파일을 찾아 렌더링합니다.
    }
}
