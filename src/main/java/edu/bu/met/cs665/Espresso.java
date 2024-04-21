package edu.bu.met.cs665;

public class Espresso extends Beverage {
    float price = 2;
    static String bevDetails = "Espresso Beverage";
    int milkUnitCount = 0;
    int sugarUnitCount = 0;
    @Override
    public float getPrice() {
        return (float) (price);
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String getBevDetails(){
        return bevDetails;
    }

    @Override
    public int getMilkUnitCount(){
        return milkUnitCount;
    }

    @Override
    public int getSugarUnitCount(){
        return sugarUnitCount;
    }



}
