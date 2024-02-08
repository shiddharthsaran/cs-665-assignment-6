/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/08/2024
 * File Name: Main.java
 * Description: This file is the Main entry point to the program.
 */
package edu.bu.met.cs665;
import java.util.Scanner;
public class Main {
    /**
     * Prompts the user for input within a specified range and returns the user's selection.
     * @param min The minimum value allowed for user input.
     * @param max The maximum value allowed for user input.
     * @param usrQues The question prompt to display to the user.
     * @return The user's input within the specified range.
     */
    public static int getUserInp(int min, int max, String usrQues){
        Scanner inpObj = new Scanner(System.in);
        while (true){
            System.out.println(usrQues);
            int usrInp = inpObj.nextInt();
            if (usrInp >= min && usrInp <=max){
                return usrInp;
            }

        }
    }

    /**
     * The main method where the execution of the program begins.
     * Offers options for beverages and customization, and displays the order details.
     * Continues running until the user chooses to quit.
     */
    public static void main(String[] args) {
        while (true) {
            int usrInp = getUserInp(1, 3, "Please Enter an Option:\n1. Coffee\n2.Tea\n3. Quit");

            if (usrInp == 3) {
                break;
            } else if (usrInp == 1) {
                usrInp = getUserInp(1, 3, "Please Enter type of Coffee:\n1. Espresso\n2. Latte Macchiato\n3. Americano.");
                if (usrInp == 1) {
                    // Customization options for Espresso
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    Espresso usrBev = new Espresso(milkUnt, sugarUnt);
                    String formattedString = "Here is %s with %d Milk, %d Sugar and the price is $%.2f.".formatted(usrBev.getBevName(), usrBev.getMilk(), usrBev.getSugar(), usrBev.getTotPrice());
                    System.out.println(formattedString);
                } else if (usrInp == 2) {
                    // Customization options for Latte Macchiato
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    LatteMacchiato usrBev = new LatteMacchiato(milkUnt, sugarUnt);
                    String formattedString = "Here is %s with %d Milk, %d Sugar and the price is $%.2f.".formatted(usrBev.getBevName(), usrBev.getMilk(), usrBev.getSugar(), usrBev.getTotPrice());
                    System.out.println(formattedString);
                } else if (usrInp == 3) {
                    // Customization options for Americano
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    Americano usrBev = new Americano(milkUnt, sugarUnt);
                    String formattedString = "Here is %s with %d Milk, %d Sugar and the price is $%.2f.".formatted(usrBev.getBevName(), usrBev.getMilk(), usrBev.getSugar(), usrBev.getTotPrice());
                    System.out.println(formattedString);
                }
            } else if (usrInp == 2) {
                usrInp = getUserInp(1, 3, "Please Enter type of Tea:\n1. Black Tea\n2. Yellow Tea\n3. Green Tea.");
                if (usrInp == 1) {
                    // Customization options for Black Tea
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    BlackTea usrBev = new BlackTea(milkUnt, sugarUnt);
                    String formattedString = "Here is %s with %d Milk, %d Sugar and the price is $%.2f.".formatted(usrBev.getBevName(), usrBev.getMilk(), usrBev.getSugar(), usrBev.getTotPrice());
                    System.out.println(formattedString);
                } else if (usrInp == 2) {
                    // Customization options for Yellow Tea
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    YellowTea usrBev = new YellowTea(milkUnt, sugarUnt);
                    String formattedString = "Here is %s with %d Milk, %d Sugar and the price is $%.2f.".formatted(usrBev.getBevName(), usrBev.getMilk(), usrBev.getSugar(), usrBev.getTotPrice());
                    System.out.println(formattedString);
                } else if (usrInp == 3) {
                    // Customization options for Green Tea
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    GreenTea usrBev = new GreenTea(milkUnt, sugarUnt);
                    String formattedString = "Here is %s with %d Milk, %d Sugar and the price is $%.2f.".formatted(usrBev.getBevName(), usrBev.getMilk(), usrBev.getSugar(), usrBev.getTotPrice());
                    System.out.println(formattedString);
                }
            }


        }
    }
    }
