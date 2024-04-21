/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/21/2024
 * File Name: AddOnCountCheck.java
 * Description: AddOnCountCheck class provides utility methods for checking and adding beverage add-ons based on count criteria.
 */
package edu.bu.met.cs665;

import java.util.Objects;

public class AddOnCountCheck {
    /**
     * Checks the count of a specific add-on for a given beverage and adds it if the count is below a certain threshold.
     *
     * @param bev           The beverage to which the add-on may be added.
     * @param bevAddOnType  The type of add-on to be checked and added (e.g., "milk", "sugar").
     * @return              The modified beverage with the add-on added if applicable, or the original beverage if not.
     */

    public Beverage countCheck(Beverage bev, String bevAddOnType){

        if(Objects.equals(bevAddOnType, "milk")){

            if (bev.getMilkUnitCount() < 3){
                return new Milk(bev);
            }
            else{
                return bev;
            }

        } else if (Objects.equals(bevAddOnType, "sugar")) {

            if (bev.getSugarUnitCount() < 3){
                return new Sugar(bev);
            }
            else{
                return bev;
            }

        }else {
            return bev;
        }

    }
}
