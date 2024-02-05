package edu.bu.met.cs665.beverages.coffee;

import edu.bu.met.cs665.beverages.Beverages;

public class Coffee extends Beverages {
    public float basePrice = 2;

    public Coffee(int milk, int sugar) {
        super(milk, sugar);
    }
}