package edu.bu.met.cs665;

public class BlackTea extends Tea {
    public float addPrice = 1;

    public BlackTea(int milk, int sugar) {
        super(milk, sugar);
    }

    public void setAddPrice(float addPrice){
        this.addPrice = addPrice;
    }

    public float getAddPrice(){
        return addPrice;
    }

    public float getTotPrice(){
        return (float) (this.addPrice + this.basePrice + (this.milk + this.sugar) * 0.5);
    }

    public String getBevName(){
        return "Black Tea";
    }
}
