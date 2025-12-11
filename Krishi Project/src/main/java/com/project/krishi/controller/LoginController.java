package com.project.krishi.controller;

import com.project.krishi.dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("Dto", new LoginDto());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute LoginDto Dto, Model model) {
        System.err.println(Dto.getEmail());
        System.err.println(Dto.getPassword());
        System.err.println(Dto.isRememberMe());

        model.addAttribute("Dto", new LoginDto());

        return "productcard";
    }


}
