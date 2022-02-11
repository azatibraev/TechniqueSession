package com.company;

public class Technique {
    private String name;
    private int serialNumber;

    public Technique() {
    }

    public Technique(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public void powerOn(){
        System.out.println("The technique should be Power on");
    }
    public void powerOff(){
        System.out.println(" The technique can Power off");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Technique info: " + '\n' +
                "name: " + name + '\n' +
                "serialNumber: " + serialNumber;
    }
}
