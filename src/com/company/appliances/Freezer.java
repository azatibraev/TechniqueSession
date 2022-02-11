package com.company.appliances;

public class Freezer extends Appliances {

    private int temperature;
    private String description;


    public Freezer(String name, int serialNumber, String name1, String color, double weight, int temperature,
                   String description) {
        super(name, serialNumber, name1, color, weight);
        this.temperature = temperature;
        this.description = description;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Freezer info: " + '\n' +
                "temperature: " + temperature + '\n' +
                "description: " + description + '\n' + super.toString();
    }

    @Override
    protected void freeze() {
        super.freeze();
        System.out.println("sdfsdfsdfsdfs");
    }

    @Override
    protected void work() {
        super.work();
    }
}
