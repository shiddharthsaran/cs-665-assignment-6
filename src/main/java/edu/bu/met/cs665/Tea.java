package edu.bu.met.cs665;


public class Tea extends Beverages {
    public float basePrice = 2;

    public Tea(int milk, int sugar) {
        super(milk, sugar);
    }

    public void setBasePrice(float basePrice){
        this.basePrice = basePrice;
    }

    public float getBasePrice(){
        return basePrice;
    }
}

