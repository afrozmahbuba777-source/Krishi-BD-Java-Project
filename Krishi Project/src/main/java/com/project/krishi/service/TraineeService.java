package com.project.krishi.service;

import com.project.krishi.model.Trainee;
import com.project.krishi.repository.TraineeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TraineeService {

    private final TraineeRepository traineeRepository;

    // Constructor injection of the repository
    public TraineeService(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    // Save the trainee entity to the database
    public Trainee save(Trainee trainee) {
        return traineeRepository.save(trainee);
    }


     public List<Trainee> getAllTrainees() {
        return (List<Trainee>) traineeRepository.findAll();
    }




}
