package com.company.vehicles;

import com.company.Technique;

public class Vehicles  extends Technique {
    private String name;
    private String typeOfVehicle;

    protected void drive(){
        System.out.println(" bip bip");
    }
    protected void fly(){
        System.out.println(" I can believe, I can fly!");
    }

    public Vehicles(String name, int serialNumber, String name1, String typeOfVehicle) {
        super(name, serialNumber);
        this.name = name1;
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    @Override
    public String toString() {
        return "Vehicles info: " + '\n' +
                "name:" + name + '\n' +
                "typeOfVehicle: " + typeOfVehicle + '\n' + super.toString();
    }
}
