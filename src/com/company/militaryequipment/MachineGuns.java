package com.company.militaryequipment;

public class MachineGuns  extends MilitaryEquipment {

    private String name;
    private String machineGunsId;

    public MachineGuns(String name, int serialNumber, String typeofME, String assignment, String name1, String machineGunsId) {
        super(name, serialNumber, typeofME, assignment);
        this.name = name1;
        this.machineGunsId = machineGunsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMachineGunsId() {
        return machineGunsId;
    }

    public void setMachineGunsId(String machineGunsId) {
        this.machineGunsId = machineGunsId;
    }

    @Override
    public String toString() {
        return "MachineGuns info:" +'\n' +
                "name: " + name + '\n' +
                "machineGunsId: " + machineGunsId + '\n' + super.toString();
    }

    @Override
    protected void shoot() {
        super.shoot();
    }
}
