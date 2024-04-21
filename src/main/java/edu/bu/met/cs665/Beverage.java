package edu.bu.met.cs665;

public abstract class Beverage {
    String bevDetails = "Base Beverage";

    int milkUnitCount = 0;
    int sugarUnitCount = 0;




    public String getBevDetails() {
        return bevDetails;
    }

    public int getMilkUnitCount(){
        return milkUnitCount;
    }

    public int getSugarUnitCount(){
        return sugarUnitCount;
    }



    public abstract float getPrice();
    public abstract void setPrice(float price);



}
