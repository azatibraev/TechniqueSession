package com.company.appliances;

import com.company.Technique;

public class Appliances  extends Technique {
    private String name;
    private String color;
    private double weight;



    protected void freeze(){
        System.out.println("is freezing!");
    }
    protected void work(){
        System.out.println(" is it work?");
    }

    public Appliances(String name, int serialNumber, String name1, String color, double weight) {
        super(name, serialNumber);
        this.name = name1;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Appliances info: " + '\n' +
                "name: " + name + '\n' +
                "color: " + color + '\n' +
                "weight:" + weight + '\n' + super.toString();
    }

    @Override
    public void powerOn() {
        super.powerOn();
    }

    @Override
    public void powerOff() {
        super.powerOff();
    }
}
