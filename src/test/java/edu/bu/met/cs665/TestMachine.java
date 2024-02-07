package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMachine {
    public TestMachine(){

    }

    @Test
    public void testEsp(){
        Espresso esp = new Espresso(2, 2);
        assertEquals(6.0, esp.getTotPrice(), 0.0001);


    }
    @Test
    public void testYt(){
        YellowTea yt = new YellowTea(1, 2);
        assertEquals(6.5, yt.getTotPrice(), 0.0001);
    }

    @Test
    public void testBt(){
        BlackTea bt = new BlackTea(3, 3);
        bt.setMilk(0);
        assertEquals(4.5, bt.getTotPrice(), 0.0001);
    }

    @Test
    public void testLm(){
        LatteMacchiato lm = new LatteMacchiato(0, 0);
        lm.setSugar(100);
        assertEquals(5.0, lm.getTotPrice(), 0.0001);
        lm.setSugar(1);
        assertEquals(5.5, lm.getTotPrice(), 0.0001);
    }
}
