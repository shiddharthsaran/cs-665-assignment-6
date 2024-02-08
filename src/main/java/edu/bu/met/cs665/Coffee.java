package edu.bu.met.cs665;

public class Coffee extends Beverages {
    public float basePrice = 2;

    public Coffee(int milk, int sugar) {
        super(milk, sugar);
    }
    public void setBasePrice(float basePrice){
        this.basePrice = basePrice;
    }

    public float getBasePrice(){
        return basePrice;
    }
}