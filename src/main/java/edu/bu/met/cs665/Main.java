package edu.bu.met.cs665;
import java.util.Scanner;
public class Main {
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
    public static void main(String[] args) {
        while (true) {
            int usrInp = getUserInp(1, 3, "Please Enter an Option:\n1. Coffee\n2.Tea\n3. Quit");

            if (usrInp == 3) {
                break;
            } else if (usrInp == 1) {
                usrInp = getUserInp(1, 3, "Please Enter type of Coffee:\n1. Espresso\n2. Latte Macchiato\n3. Americano.");
                if (usrInp == 1) {
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    Espresso usrBev = new Espresso(milkUnt, sugarUnt);
                    float totPrice = (float) (usrBev.addPrice + usrBev.basePrice + (usrBev.milk + usrBev.sugar) * 0.5);
                    String formattedString = """
                            Here is Espresso with %d Milk, %d Sugar and the price is %f
                            """.formatted(usrBev.milk, usrBev.sugar, totPrice);
                    System.out.println(formattedString);
                } else if (usrInp == 2) {
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    LatteMacchiato usrBev = new LatteMacchiato(milkUnt, sugarUnt);
                    float totPrice = (float) (usrBev.addPrice + usrBev.basePrice + (usrBev.milk + usrBev.sugar) * 0.5);
                    String formattedString = """
                            Here is Latte Macchiato with %d Milk, %d Sugar and the price is %f
                            """.formatted(usrBev.milk, usrBev.sugar, totPrice);
                    System.out.println(formattedString);
                } else if (usrInp == 3) {
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    Americano usrBev = new Americano(milkUnt, sugarUnt);
                    float totPrice = (float) (usrBev.addPrice + usrBev.basePrice + (usrBev.milk + usrBev.sugar) * 0.5);
                    String formattedString = """
                            Here is Americano with %d Milk, %d Sugar and the price is %f
                            """.formatted(usrBev.milk, usrBev.sugar, totPrice);
                    System.out.println(formattedString);
                }
            } else if (usrInp == 2) {
                usrInp = getUserInp(1, 3, "Please Enter type of Tea:\n1. Black Tea\n2. Yellow Tea\n3. Green Tea.");
                if (usrInp == 1) {
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    BlackTea usrBev = new BlackTea(milkUnt, sugarUnt);
                    float totPrice = (float) (usrBev.addPrice + usrBev.basePrice + (usrBev.milk + usrBev.sugar) * 0.5);
                    String formattedString = """
                            Here is BlackTea with %d Milk, %d Sugar and the price is %f
                            """.formatted(usrBev.milk, usrBev.sugar, totPrice);
                    System.out.println(formattedString);
                } else if (usrInp == 2) {
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    YellowTea usrBev = new YellowTea(milkUnt, sugarUnt);
                    float totPrice = (float) (usrBev.addPrice + usrBev.basePrice + (usrBev.milk + usrBev.sugar) * 0.5);
                    String formattedString = """
                            Here is Yellow Tea with %d Milk, %d Sugar and the price is %f
                            """.formatted(usrBev.milk, usrBev.sugar, totPrice);
                    System.out.println(formattedString);
                } else if (usrInp == 3) {
                    int milkUnt = getUserInp(0, 3, "Please Enter number of units of milk(0 - 3)");
                    int sugarUnt = getUserInp(0, 3, "Please Enter number of units of sugar(0 - 3)");
                    GreenTea usrBev = new GreenTea(milkUnt, sugarUnt);
                    float totPrice = (float) (usrBev.addPrice + usrBev.basePrice + (usrBev.milk + usrBev.sugar) * 0.5);
                    String formattedString = """
                            Here is Green Tea with %d Milk, %d Sugar and the price is %f
                            """.formatted(usrBev.milk, usrBev.sugar, totPrice);
                    System.out.println(formattedString);
                }
            }


        }
    }
    }
