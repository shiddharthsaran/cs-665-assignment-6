/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/08/2024
 * File Name: YellowTea.java
 * Description: YellowTea class represents a type of tea beverage. It extends the Tea class and provides additional functionality specific to YellowTea.
 */
package edu.bu.met.cs665;

public class YellowTea extends Tea {
    /**
     * Additional price for customization.
     */
    public float addPrice = 3;
    /**
     * Constructor to initialize a Yellow Tea object with given milk and sugar units.
     * @param milk The units of milk to add to the Yellow Tea.
     * @param sugar The units of sugar to add to the Yellow Tea.
     */
    public YellowTea(int milk, int sugar) {
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
     * Calculates the total price of the Yellow Tea beverage.
     * @return The total price of the Yellow Tea.
     */

    public float getTotPrice(){
        return (float) (this.addPrice + this.basePrice + (this.milk + this.sugar) * 0.5);
    }
    /**
     * Gets the name of the beverage.
     * @return The name of the beverage ("Yellow Tea").
     */

    public String getBevName(){
        return "Yellow Tea";
    }
}