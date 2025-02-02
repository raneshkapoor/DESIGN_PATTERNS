package com.designs.patterns.creational.builder;

public class Car {

    private String carId;
    private String modelId;
    private String name;
    private String description;
    private String dimensions;

    private Car(CarBuilder carBuilder) {
        this.carId = carBuilder.carId;
        this.modelId = carBuilder.modelId;
        this.name = carBuilder.name;
        this.description = carBuilder.description;
        this.dimensions = carBuilder.dimensions;
    }

    public static class CarBuilder {

        private final String carId;
        private final String modelId;
        private String name;
        private String description;
        private String dimensions;

        public CarBuilder(String carId, String modelId) {
            this.carId = carId;
            this.modelId = modelId;
        }

        public CarBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder description(String description) {
            this.description = description;
            return this;
        }

        public CarBuilder dimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

}
