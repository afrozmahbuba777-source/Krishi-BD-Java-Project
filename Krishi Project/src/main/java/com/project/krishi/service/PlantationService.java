package com.project.krishi.service;

import com.project.krishi.model.Plantation;
import com.project.krishi.repository.PlantationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantationService {
    private final PlantationRepository plantationRepository;

    public PlantationService(PlantationRepository plantationRepository) {
        this.plantationRepository = plantationRepository;
    }

    public void save(Plantation plantation) {
        plantationRepository.save(plantation);
    }

    public List<Plantation> getAllPlantations() {
        return plantationRepository.findAll();
    }
    // Fetch data from DB

}

