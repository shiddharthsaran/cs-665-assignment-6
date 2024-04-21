/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/21/2024
 * File Name: Sugar.java
 * Description: Sugar class represents an add-on for beverages, providing sugar customization. It extends the BevAddOns class.
 */
package edu.bu.met.cs665;

public class Sugar extends BevAddOns{

    float sugarUnitPrice = 0.5F;
    /**
     * Constructor to create a Sugar add-on for a given beverage.
     * @param bev The beverage to which the sugar add-on is added.
     */
    public Sugar(Beverage bev){
        this.bev = bev;

    }
    /**
     * Gets the details of the beverage with the sugar add-on.
     * @return The details of the beverage with the sugar add-on.
     */
    @Override
    public String getBevDetails() {
        return this.bev.getBevDetails() + " + 1 Sugar Unit";
    }
    /**
     * Gets the total price of the beverage with the sugar add-on.
     * @return The total price of the beverage with the sugar add-on.
     */
    @Override
    public float getPrice() {
        return (float) (this.bev.getPrice() + 0.5);
    }
    /**
     * Sets the price of the sugar unit.
     * @param price The price of the sugar unit to set.
     */
    @Override
    public void setPrice(float price) {
        this.sugarUnitPrice = price;

    }
    /**
     * Gets the count of sugar units in the beverage with the sugar add-on.
     * @return The count of sugar units in the beverage with the sugar add-on.
     */
    @Override
    public int getSugarUnitCount(){
        return this.bev.getSugarUnitCount() + 1;
    }
    /**
     * Gets the count of milk units in the beverage with the sugar add-on.
     * @return The count of milk units in the beverage with the sugar add-on.
     */
    @Override
    public int getMilkUnitCount(){return this.bev.getMilkUnitCount();}



}
