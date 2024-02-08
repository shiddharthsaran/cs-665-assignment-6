/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/08/2024
 * File Name: Espresso.java
 * Description: Espresso class represents a type of coffee beverage. It extends the Coffee class and provides additional functionality specific to Espresso.
 */
package edu.bu.met.cs665;

public class Espresso extends Coffee {
    /**
     * Additional price for customization.
     */
    public float addPrice = 2;
    /**
     * Constructor to initialize an Espresso object with given milk and sugar units.
     * @param milk The units of milk to add to the Espresso.
     * @param sugar The units of sugar to add to the Espresso.
     */
    public Espresso(int milk, int sugar) {
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
     * Calculates the total price of the Espresso beverage.
     * @return The total price of the Espresso.
     */

    public float getTotPrice(){
        return (float) (this.addPrice + this.basePrice + (this.milk + this.sugar) * 0.5);
    }
    /**
     * Gets the name of the beverage.
     * @return The name of the beverage ("Espresso").
     */

    public String getBevName(){
        return "Espresso";
    }
}