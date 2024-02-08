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
        Espresso esp = new Espresso(2, 2);
        assertEquals(6.0, esp.getTotPrice(), 0.0001);


    }
    /**
     * Unit test for Yellow Tea beverage.
     */
    @Test
    public void testYt(){
        YellowTea yt = new YellowTea(1, 2);
        assertEquals(6.5, yt.getTotPrice(), 0.0001);
    }
    /**
     * Unit test for Black Tea beverage.
     */
    @Test
    public void testBt(){
        BlackTea bt = new BlackTea(3, 3);
        bt.setMilk(0);
        assertEquals(4.5, bt.getTotPrice(), 0.0001);
    }
    /**
     * Unit test for Latte Macchiato beverage.
     */
    @Test
    public void testLm(){
        LatteMacchiato lm = new LatteMacchiato(0, 0);
        lm.setSugar(100);
        assertEquals(5.0, lm.getTotPrice(), 0.0001);
        lm.setSugar(1);
        assertEquals(5.5, lm.getTotPrice(), 0.0001);
    }
}
