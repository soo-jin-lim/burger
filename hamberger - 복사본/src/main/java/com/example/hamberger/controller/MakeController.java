package com.example.hamberger.controller;

import com.example.hamberger.domain.StudyEntity;
import com.example.hamberger.service.MakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/make")
public class MakeController {

    private final MakeService makeService;

    @Autowired
    public MakeController(MakeService makeService) {
        this.makeService = makeService;
    }

    @GetMapping("/form")
    public String getMakePage() {
        return "board/make"; // Return the path to your form template
    }

    @PostMapping("/register")
    public String register(@RequestParam("studyName") String studyName,
                           @RequestParam("phoneNumber") String phoneNumber,
                           @RequestParam("email") String email,
                           @RequestParam("post") String post,
                           @RequestParam("persons") String persons,
                           @RequestParam("progressMethod") String progressMethod,
                           @RequestParam("closeDate") String closeDate,
                           Model model) {

        // Create a new StudyEntity with the provided data
        StudyEntity studyEntity = new StudyEntity();
        studyEntity.setStudyName(studyName);
        studyEntity.setPhoneNumber(phoneNumber);
        studyEntity.setEmail(email);
        studyEntity.setPost(post);
        studyEntity.setPersons(persons);
        studyEntity.setProgressMethod(progressMethod);
        studyEntity.setCloseDate(closeDate);


        // Add any additional model attributes or logic as needed

        // Redirect to the desired page after registration (modify as needed)
        return "redirect:/success"; // Change to the appropriate success page
    }
}
