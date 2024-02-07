package edu.bu.met.cs665;

public class GreenTea extends Tea {
    public float addPrice = 2;
    public GreenTea(int milk, int sugar) {
        super(milk, sugar);
    }

    public void setAddPrice(int addPrice){
        this.addPrice = addPrice;
    }

    public float getAddPrice(){
        return addPrice;
    }

    public float getTotPrice(){
        return (float) (this.addPrice + this.basePrice + (this.milk + this.sugar) * 0.5);
    }

    public String getBevName(){
        return "Green Tea";
    }
}