package com.company.militaryequipment;

public class AirForceWeapons  extends MilitaryEquipment {

    private String power;
    private double height;

    public AirForceWeapons(String name, int serialNumber, String typeofME, String assignment,
                           String power, double height) {
        super(name, serialNumber, typeofME, assignment);
        this.power = power;
        this.height = height;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "AirForceWeapons:" + '\n' +
                "power: " + power + '\n' +
                "height: " + height + '\n' + super.toString();
    }

    @Override
    protected void shoot() {
        super.shoot();
    }
}
