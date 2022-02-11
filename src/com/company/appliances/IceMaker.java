package com.company.appliances;

public class IceMaker  extends Appliances{
    private String typeOfIceMaker;
    private String principle;

    public IceMaker(String name, int serialNumber, String name1, String color, double weight,
                    String typeOfIceMaker, String principle) {
        super(name, serialNumber, name1, color, weight);
        this.typeOfIceMaker = typeOfIceMaker;
        this.principle = principle;
    }

    public String getTypeOfIceMaker() {
        return typeOfIceMaker;
    }

    public void setTypeOfIceMaker(String typeOfIceMaker) {
        this.typeOfIceMaker = typeOfIceMaker;
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    @Override
    public String toString() {
        return "IceMaker info: " + '\n' +
                "typeOfIceMaker: " + typeOfIceMaker + '\n' +
                "principle:" + principle +
                '\n' + super.toString();
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
