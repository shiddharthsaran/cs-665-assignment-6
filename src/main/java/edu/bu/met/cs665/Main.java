package edu.bu.met.cs665;

public class Main {

    public static void main(String[] args){
        Beverage bev = new Espresso();
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "milk");

        System.out.println(bev.getPrice());
    }
}
