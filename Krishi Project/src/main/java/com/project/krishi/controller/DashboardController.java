package com.project.krishi.controller;
import com.project.krishi.model.Plantation;
import com.project.krishi.model.User;
import com.project.krishi.service.PlantationService;
import com.project.krishi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {
    private final UserService userService;

    private final PlantationService plantationService;

    public DashboardController(UserService userService, PlantationService plantationService) {
        this.userService = userService;
        this.plantationService = plantationService;
    }

    @GetMapping("/dashboard")
    public String dashboardPage( Model model) {
        List<User> userList = userService.getAll();
        model.addAttribute("userList", userList);

        List<Plantation> plantations = plantationService.getAllPlantations();

        // Add plantation data to the model to be used in the view
        model.addAttribute("plantations", plantations);

        return "dashboard";

}

}
