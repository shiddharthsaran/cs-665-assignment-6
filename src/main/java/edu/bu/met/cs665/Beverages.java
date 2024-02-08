/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/08/2024
 * File Name: Beverages.java
 * Description: Beverages class represents a general beverage with customizable milk and sugar options. It serves as a base class for beverage types.
 */
package edu.bu.met.cs665;

public class Beverages {
    /**
     * The units of milk and sugar in the beverage.
     */
    public int milk;
    public int sugar;
    /**
     * Constructor to initialize a Beverages object with given milk and sugar units.
     * @param milk The units of milk in the beverage.
     * @param sugar The units of sugar in the beverage.
     */
    public Beverages(int milk, int sugar){
        this.milk = milk;
        this.sugar = sugar;
    }
    /**
     * Sets the units of milk in the beverage, within the range of 0 to 3.
     * @param milk The units of milk to set.
     */
    public void setMilk(int milk){
        if (milk >= 0 && milk <= 3){
            this.milk = milk;
        }
    }
    /**
     * Gets the units of milk in the beverage.
     * @return The units of milk.
     */
    public int getMilk(){
        return milk;
    }
    /**
     * Sets the units of sugar in the beverage, within the range of 0 to 3.
     * @param sugar The units of sugar to set.
     */

    public void setSugar(int sugar){
        if (sugar >= 0 && sugar <= 3) {
            this.sugar = sugar;
        }
    }
    /**
     * Gets the units of sugar in the beverage.
     * @return The units of sugar.
     */
    public int getSugar(){
        return sugar;
    }
}
