/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/21/2024
 * File Name: Milk.java
 * Description: Milk class represents an add-on for beverages, providing milk customization. It extends the BevAddOns class.
 */
package edu.bu.met.cs665;

public class Milk extends BevAddOns{

    float milkUnitPrice = 0.5F;
    /**
     * Constructor to create a Milk add-on for a given beverage.
     * @param bev The beverage to which the milk add-on is added.
     */
    public Milk(Beverage bev){
        this.bev = bev;

    }
    /**
     * Gets the details of the beverage with the milk add-on.
     * @return The details of the beverage with the milk add-on.
     */
    @Override
    public String getBevDetails() {
        return this.bev.getBevDetails() + " + 1 Milk Unit";
    }
    /**
     * Gets the total price of the beverage with the milk add-on.
     * @return The total price of the beverage with the milk add-on.
     */

    @Override
    public float getPrice() {
        return (float) (this.bev.getPrice() + milkUnitPrice);
    }
    /**
     * Sets the price of the milk unit.
     * @param price The price of the milk unit to set.
     */
    @Override
    public void setPrice(float price) {
        this.milkUnitPrice = price;

    }

    /**
     * Gets the count of milk units in the beverage with the milk add-on.
     * @return The count of milk units in the beverage with the milk add-on.
     */
    @Override
    public int getMilkUnitCount(){
        return this.bev.getMilkUnitCount() + 1;
    }
    /**
     * Gets the count of sugar units in the beverage with the milk add-on.
     * @return The count of sugar units in the beverage with the milk add-on.
     */
    @Override
    public int getSugarUnitCount(){
        return this.bev.getSugarUnitCount() ;
    }



}
