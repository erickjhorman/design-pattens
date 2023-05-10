package org.example.model;


public class Car {

    //required parameters
    private String id;
    private String name;
    private String typeOfCar;

    //Optional parameters
    private int cubitCapacity;

    private String color;

    private int size;

    private Car(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.typeOfCar = builder.typeOfCar;
        this.cubitCapacity = builder.cubitCapacity;
        this.color = builder.color;
        this.size = builder.size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public int getCubitCapacity() {
        return cubitCapacity;
    }

    public void setCubitCapacity(int cubitCapacity) {
        this.cubitCapacity = cubitCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static class Builder {
        private String id;
        private String name;
        private String typeOfCar;

        private int cubitCapacity;

        private String color;

        private int size;

        public Builder(String id, String name, String typeOfCar) {
            this.id = id;
            this.name = name;
            this.typeOfCar = typeOfCar;
        }

        public Builder setCubitCapacity(int cubitCapacity) {
            this.cubitCapacity = cubitCapacity;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
