package com.project.krishi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
    public class Plantation {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        private LocalDate plantingDate;
        private LocalDate harvestDate;
        private String cropType;
        private int fieldSize;
        private String waterSource;

        public Plantation() {
        }

        public Plantation(LocalDate plantingDate, LocalDate harvestDate, String cropType, int fieldSize, String waterSource) {
            this.plantingDate = plantingDate;
            this.harvestDate = harvestDate;
            this.cropType = cropType;
            this.fieldSize = fieldSize;
            this.waterSource = waterSource;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public LocalDate getPlantingDate() {
            return plantingDate;
        }

        public void setPlantingDate(LocalDate plantingDate) {
            this.plantingDate = plantingDate;
        }

        public LocalDate getHarvestDate() {
            return harvestDate;
        }

        public void setHarvestDate(LocalDate harvestDate) {
            this.harvestDate = harvestDate;
        }

        public String getCropType() {
            return cropType;
        }

        public void setCropType(String cropType) {
            this.cropType = cropType;
        }

        public int getFieldSize() {
            return fieldSize;
        }

        public void setFieldSize(int fieldSize) {
            this.fieldSize = fieldSize;
        }

        public String getWaterSource() {
            return waterSource;
        }

        public void setWaterSource(String waterSource) {
            this.waterSource = waterSource;
        }
    }


