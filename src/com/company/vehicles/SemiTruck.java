package com.company.vehicles;

public class SemiTruck extends Vehicles{

    private double power;
    private double size;

    public SemiTruck(String name, int serialNumber, String name1, String typeOfVehicle, double size) {
        super(name, serialNumber, name1, typeOfVehicle);
        this.size = size;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "SemiTruck info: " + '\n'+
                "power: " + power +'\n'+
                "size:" + size + super.toString();
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
