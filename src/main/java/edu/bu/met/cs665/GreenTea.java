/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/08/2024
 * File Name: GreenTea.java
 * Description: GreenTea class represents a type of tea beverage. It extends the Tea class and provides additional functionality specific to GreenTea.
 */
package edu.bu.met.cs665;

public class GreenTea extends Tea {
    /**
     * Additional price for customization.
     */
    public float addPrice = 2;
    /**
     * Constructor to initialize a Green Tea object with given milk and sugar units.
     * @param milk The units of milk to add to the Green Tea.
     * @param sugar The units of sugar to add to the Green Tea.
     */
    public GreenTea(int milk, int sugar) {
        super(milk, sugar);
    }
    /**
     * Sets the additional price for customization.
     * @param addPrice The additional price to set.
     */

    public void setAddPrice(float addPrice){
        this.addPrice = addPrice;
    }
    /**
     * Gets the additional price for customization.
     * @return The additional price.
     */

    public float getAddPrice(){
        return addPrice;
    }
    /**
     * Calculates the total price of the Green Tea beverage.
     * @return The total price of the Green Tea.
     */

    public float getTotPrice(){
        return (float) (this.addPrice + this.basePrice + (this.milk + this.sugar) * 0.5);
    }
    /**
     * Gets the name of the beverage.
     * @return The name of the beverage ("Green Tea").
     */

    public String getBevName(){
        return "Green Tea";
    }
}