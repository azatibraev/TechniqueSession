package com.company.vehicles;

public class Van  extends Vehicles {

    private String color;
    private String description;

    public Van(String name, int serialNumber, String name1, String typeOfVehicle, String color, String description) {
        super(name, serialNumber, name1, typeOfVehicle);
        this.color = color;
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Van info: " +'\n' +
                "color: " + color + '\n' +
                "description: " + description +
                '\n' + super.toString();
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
