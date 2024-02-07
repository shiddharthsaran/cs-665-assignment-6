package edu.bu.met.cs665;

public class Beverages {
    public int milk;
    public int sugar;
    public Beverages(int milk, int sugar){
        this.milk = milk;
        this.sugar = sugar;
    }

    public void setMilk(int milk){
        if (milk >= 0 && milk <= 3){
            this.milk = milk;
        }
    }

    public int getMilk(){
        return milk;
    }

    public void setSugar(int sugar){
        if (sugar >= 0 && sugar <= 3) {
            this.sugar = sugar;
        }
    }

    public int getSugar(){
        return sugar;
    }
}
