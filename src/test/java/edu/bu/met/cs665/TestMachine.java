/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 02/08/2024
 * File Name: TestMachine.java
 * Description: TestMachine class contains unit tests for various beverage types and their customization options.
 */
package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMachine {
    /**
     * Default constructor for TestMachine.
     */
    public TestMachine(){

    }
    /**
     * Unit test for Espresso beverage.
     */
    @Test
    public void testEsp(){
        Beverage esp = new Espresso();

        esp = new AddOnCountCheck().countCheck(esp, "milk");
        esp = new AddOnCountCheck().countCheck(esp, "milk");

        esp = new AddOnCountCheck().countCheck(esp, "sugar");
        esp = new AddOnCountCheck().countCheck(esp, "sugar");


        assertEquals(6.0, esp.getPrice(), 0.0001);


    }
    /**
     * Unit test for Yellow Tea beverage.
     */
    @Test
    public void testYt(){
        Beverage yt = new YellowTea();

        yt = new AddOnCountCheck().countCheck(yt, "milk");

        yt = new AddOnCountCheck().countCheck(yt, "sugar");
        yt = new AddOnCountCheck().countCheck(yt, "sugar");
        assertEquals(6.5, yt.getPrice(), 0.0001);
    }
    /**
     * Unit test for Black Tea beverage.
     */
    @Test
    public void testBt(){
        Beverage bt = new BlackTea();

        bt = new AddOnCountCheck().countCheck(bt, "sugar");
        bt = new AddOnCountCheck().countCheck(bt, "sugar");
        bt = new AddOnCountCheck().countCheck(bt, "sugar");


        assertEquals(4.5, bt.getPrice(), 0.0001);
    }
    /**
     * Unit test for Latte Macchiato beverage.
     */
    @Test
    public void testLm(){
        Beverage lm = new LatteMacchiato();
        for(int i = 0; i < 100; i++){
            lm = new AddOnCountCheck().countCheck(lm, "sugar");

        }
        assertEquals(6.5, lm.getPrice(), 0.0001);
    }
}
