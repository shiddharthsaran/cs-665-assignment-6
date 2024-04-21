package edu.bu.met.cs665;

public class Milk extends BevAddOns{

    public Milk(Beverage bev){
        this.bev = bev;

    }
    @Override
    public String getBevDetails() {
        return this.bev.getBevDetails() + " + 1 Milk Unit";
    }

    @Override
    public float getPrice() {
        return (float) (this.bev.getPrice() + 0.5);
    }

    @Override
    public void setPrice(float price) {

    }


    @Override
    public int getMilkUnitCount(){
        return this.bev.getMilkUnitCount() + 1;
    }
    @Override
    public int getSugarUnitCount(){
        return this.bev.getSugarUnitCount() ;
    }



}
