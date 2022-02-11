package com.company.militaryequipment;

public class AerialWeapons extends MilitaryEquipment {

    private String description;
    private String purpose;

    public AerialWeapons(String name, int serialNumber, String typeofME, String assignment,
                         String description, String purpose) {
        super(name, serialNumber, typeofME, assignment);
        this.description = description;
        this.purpose = purpose;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "AerialWeapons info: " + '\n' +
                "description: " + description + '\n' +
                "purpose: " + purpose + '\n' + super.toString();
    }

    @Override
    protected void shoot() {
        super.shoot();
    }
}
