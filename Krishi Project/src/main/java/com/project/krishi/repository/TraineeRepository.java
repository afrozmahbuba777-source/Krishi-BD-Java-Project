package com.project.krishi.repository;

import com.project.krishi.model.Trainee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository


    public interface TraineeRepository extends JpaRepository<Trainee, Integer> {

    }

