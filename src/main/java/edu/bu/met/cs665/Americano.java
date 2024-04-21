package edu.bu.met.cs665;

public class Americano extends Beverage {
    float price = 3;
    static String bevDetails = "Americano Beverage";
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
