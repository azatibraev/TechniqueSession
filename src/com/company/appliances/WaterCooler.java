package com.company.appliances;

public class WaterCooler extends Appliances {

    private String typeOfWaterCooler;
    private  String filtration;

    public WaterCooler(String name, int serialNumber, String name1, String color, double weight,
                       String typeOfWaterCooler, String filtration) {
        super(name, serialNumber, name1, color, weight);
        this.typeOfWaterCooler = typeOfWaterCooler;
        this.filtration = filtration;
    }

    public String getTypeOfWaterCooler() {
        return typeOfWaterCooler;
    }

    public void setTypeOfWaterCooler(String typeOfWaterCooler) {
        this.typeOfWaterCooler = typeOfWaterCooler;
    }

    public String getFiltration() {
        return filtration;
    }

    public void setFiltration(String filtration) {
        this.filtration = filtration;
    }

    @Override
    public String toString() {
        return "WaterCooler info: " +
                "typeOfWaterCooler: " + typeOfWaterCooler + '\n' +
                "filtration: " + filtration + '\n' + super.toString();
    }

    @Override
    protected void freeze() {
        super.freeze();
    }

    @Override
    protected void work() {
        super.work();
    }
}
