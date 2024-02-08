/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/08/2024
 * File Name: BlackTea.java
 * Description: BlackTea class represents a type of tea beverage. It extends the Tea class and provides additional functionality specific to BlackTea.
 */
package edu.bu.met.cs665;

public class BlackTea extends Tea {
    /**
     * Additional price for customization.
     */
    public float addPrice = 1;
    /**
     * Constructor to initialize a Black Tea object with given milk and sugar units.
     * @param milk The units of milk to add to the Black Tea.
     * @param sugar The units of sugar to add to the Black Tea.
     */
    public BlackTea(int milk, int sugar) {
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
     * Calculates the total price of the Black Tea beverage.
     * @return The total price of the Black Tea.
     */

    public float getTotPrice(){
        return (float) (this.addPrice + this.basePrice + (this.milk + this.sugar) * 0.5);
    }
    /**
     * Gets the name of the beverage.
     * @return The name of the beverage ("Black Tea").
     */

    public String getBevName(){
        return "Black Tea";
    }
}
