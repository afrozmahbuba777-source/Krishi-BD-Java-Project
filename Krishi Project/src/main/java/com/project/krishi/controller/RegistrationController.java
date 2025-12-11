package com.project.krishi.controller;
import com.project.krishi.dto.LoginDto;
import com.project.krishi.dto.RegistrationDto;
import com.project.krishi.model.User;
import com.project.krishi.model.UserType;
import com.project.krishi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RegistrationController {
    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String registrationPage( Model model) {
        model.addAttribute("Dto", new RegistrationDto());
        return "registration";
    }

    @PostMapping("/registration")
    public String registrationSubmit(@ModelAttribute  RegistrationDto Dto, Model model) {
        User user = new User();
        user.setName(Dto.getFirstName(),Dto.getLastName());
        user.setPhoneNumber(Dto.getPhoneNumber());
        user.setEmail(Dto.getEmail());
        user.setAddress(Dto.getAddress());
        user.setPassword(Dto.getPassword());
        user.setUserType(UserType.USER);

        userService.save(user);


        LoginDto loginDto = new LoginDto();
        loginDto.setRegistrationSuccess(Boolean.TRUE);
        model.addAttribute("Dto", loginDto);
        return "login";
    }

}