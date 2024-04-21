/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 04/21/2024
 * File Name: Main.java
 * Description: Main class contains the entry point of the program.
 */

package edu.bu.met.cs665;

public class Main {

    public static void main(String[] args){
        Beverage bev = new Espresso();
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "milk");


        System.out.println(bev.getPrice());
    }
}
