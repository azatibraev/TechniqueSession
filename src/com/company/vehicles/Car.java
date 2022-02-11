package com.company.vehicles;

public class Car extends Vehicles {

    private String brand;
    private String model;

    public Car(String name, int serialNumber, String name1, String typeOfVehicle, String brand, String model) {
        super(name, serialNumber, name1, typeOfVehicle);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car info: " + '\n' +
                "brand: " + brand + '\n' +
                "model: " + model + '\n' + super.toString();
    }

    @Override
    protected void drive() {
        super.drive();
    }

    @Override
    protected void fly() {
        super.fly();
    }
}
