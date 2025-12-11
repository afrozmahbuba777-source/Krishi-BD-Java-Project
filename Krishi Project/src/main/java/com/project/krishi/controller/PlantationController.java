package com.project.krishi.controller;
import com.project.krishi.dto.PlantationDto;
import com.project.krishi.model.Plantation;
import com.project.krishi.service.PlantationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PlantationController {
    private final PlantationService plantationService;

    public PlantationController(PlantationService plantationService) {
        this.plantationService = plantationService;
    }

    @GetMapping("/plantation")
    public String showPlantationPage(Model model) {
        model.addAttribute("dto", new PlantationDto());
        return "plantation"; // Refers to plantation.html
    }

    @PostMapping("/plantation")
    public String handlePlantation(@ModelAttribute PlantationDto dto, Model model) {
        Plantation plantation = new Plantation();
        plantation.setPlantingDate(dto.getPlantingDate());
        plantation.setHarvestDate(dto.getHarvestDate());
        plantation.setCropType(dto.getCropType());
        plantation.setFieldSize(dto.getFieldSize());
        plantation.setWaterSource(dto.getWaterSource());

        plantationService.save(plantation);

        model.addAttribute("dto", new PlantationDto());
        return "plantation";
    }
}

