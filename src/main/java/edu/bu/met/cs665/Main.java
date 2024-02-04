package edu.bu.met.cs665;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        while (true){
            System.out.println("Please Enter an Option:\n1. Coffee\n2.Tea\n3. Quit");
            int usrOpt = myObj.nextInt();
            if (usrOpt > 0 && usrOpt < 4){
                if (usrOpt == 3){
                    break;
                } else if (usrOpt == 1) {
                    System.out.println("Please Enter type of Coffee:\n1. Espresso");
                    usrOpt = myObj.nextInt();
                    if (usrOpt == 1){
                        System.out.println("Please Enter number of units of milk(0 - 3)");
                        int milkUnt = myObj.nextInt();
                        System.out.println("Please Enter number of units of sugar(0 - 3)");
                        int sugarUnt = myObj.nextInt();
                        Espresso usrBev = new Espresso(milkUnt, sugarUnt);
                        float totPrice = (float) (usrBev.addPrice + usrBev.basePrice + (usrBev.milk + usrBev.sugar) * 0.5);
                        String formattedString = """
                            Here is Espresso with %d Milk, %d Sugar and the price is %f
                            """.formatted(usrBev.milk, usrBev.sugar, totPrice);
                        System.out.println(formattedString);
                    }
                }
            }


        }
    }}
