package com.company.militaryequipment;

import com.company.Technique;

public class MilitaryEquipment extends Technique {

    private String typeofME;
    private String assignment;

    protected void shoot(){
        System.out.println(" Piyu piyu");
    }

    public MilitaryEquipment(String name, int serialNumber, String typeofME, String assignment) {
        super(name, serialNumber);
        this.typeofME = typeofME;
        this.assignment = assignment;
    }

    public String getTypeofME() {
        return typeofME;
    }

    public void setTypeofME(String typeofME) {
        this.typeofME = typeofME;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    @Override
    public String toString() {
        return "MilitaryEquipment info: " + '\n' +
                "typeofME: " + typeofME + '\n' +
                "assignment: " + assignment + '\n' + super.toString();
    }
}
