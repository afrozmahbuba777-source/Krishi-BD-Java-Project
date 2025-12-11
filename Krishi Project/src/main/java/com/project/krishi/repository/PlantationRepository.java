package com.project.krishi.repository;
import com.project.krishi.model.Plantation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface PlantationRepository extends JpaRepository<Plantation, Long> {

    }


