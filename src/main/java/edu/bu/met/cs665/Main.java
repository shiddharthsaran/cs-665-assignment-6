package edu.bu.met.cs665;

public class Main {

    public static void main(String[] args){
        Beverage bev = new Espresso();
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "sugar");
        bev = new AddOnCountCheck().countCheck(bev, "sugar");
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "milk");
        bev = new AddOnCountCheck().countCheck(bev, "sugar");
        bev = new AddOnCountCheck().countCheck(bev, "sugar");
        bev = new AddOnCountCheck().countCheck(bev, "sugar");
        bev = new AddOnCountCheck().countCheck(bev, "sugar");
        bev = new AddOnCountCheck().countCheck(bev, "sugar");
        System.out.println(bev.getPrice());
        Beverage bev1 = new Espresso();
        bev1 = new AddOnCountCheck().countCheck(bev1, "milk");
        bev1 = new AddOnCountCheck().countCheck(bev1, "milk");
        bev1 = new AddOnCountCheck().countCheck(bev1, "sugar");
        bev1 = new AddOnCountCheck().countCheck(bev1, "sugar");
        bev1 = new AddOnCountCheck().countCheck(bev1, "milk");
        bev1 = new AddOnCountCheck().countCheck(bev1, "milk");
        bev1 = new AddOnCountCheck().countCheck(bev1, "milk");
        bev1 = new AddOnCountCheck().countCheck(bev1, "sugar");
        bev1 = new AddOnCountCheck().countCheck(bev1, "sugar");
        bev1 = new AddOnCountCheck().countCheck(bev1, "sugar");
        bev1 = new AddOnCountCheck().countCheck(bev1, "sugar");
        bev1 = new AddOnCountCheck().countCheck(bev1, "sugar");
        System.out.println(bev1.getPrice());
    }
}
