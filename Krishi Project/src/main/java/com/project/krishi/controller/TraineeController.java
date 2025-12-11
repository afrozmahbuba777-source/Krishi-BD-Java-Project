package com.project.krishi.controller;

import com.project.krishi.dto.TraineeDto;
import com.project.krishi.model.Trainee;
import com.project.krishi.model.UserType;
import com.project.krishi.service.TraineeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TraineeController {

    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    // GET request for the registration form
    @GetMapping("/training")
    public String showTrainingPage(Model model) {
        model.addAttribute("traineeDto", new TraineeDto());
        return "training"; // Ensure "training.html" exists
    }

    // POST request to handle form submission
    @PostMapping("/training")
    public String registerTrainee(@ModelAttribute TraineeDto traineeDto, Model model) {

        Trainee trainee = new Trainee();

        trainee.setName(traineeDto.getFirstName(),traineeDto.getLastName());// If using getName()

        trainee.setPhoneNumber(traineeDto.getPhoneNumber());
        trainee.setAddress(traineeDto.getAddress());
        trainee.setGender(traineeDto.getGender());
        trainee.setTrainingType(traineeDto.getTrainingType());
        trainee.setAdditionalDetails(traineeDto.getAdditionalDetails());
        trainee.setUserType(UserType.Trainee);

        // Save the trainee object
        traineeService.save(trainee);

        model.addAttribute("traineeDto", new TraineeDto());

        // model.addAttribute("successMessage", "Registration Successful!");
        return "training";
    }

    // GET request to retrieve all trainees
    //@PostMapping("/trainees") // Changed the mapping to prevent conflicts
    //public String getAllTrainees(@ModelAttribute TraineeDto traineeDto, Model model) {
       // List<Trainee> trainees = traineeService.getAllTrainees();
        //model.addAttribute("traineeList", trainees); // Use a distinct attribute name
       // return "training"; // Ensure "trainees.html" exists to display the list
    //}
}
