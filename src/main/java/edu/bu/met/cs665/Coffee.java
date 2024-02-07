package edu.bu.met.cs665;

public class Coffee extends Beverages {
    public float basePrice = 2;

    public Coffee(int milk, int sugar) {
        super(milk, sugar);
    }
    public void setBasePrice(int addPrice){
        this.basePrice = addPrice;
    }

    public float getBasePrice(){
        return basePrice;
    }
}