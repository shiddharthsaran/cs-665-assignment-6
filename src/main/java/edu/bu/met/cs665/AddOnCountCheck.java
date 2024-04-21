package edu.bu.met.cs665;

import java.util.Objects;

public class AddOnCountCheck {

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
