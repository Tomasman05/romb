/*
* File: RombTest.java
* Author: Vitovszki Tamás
* Copyright: 2024, Vitovszki Tamás 
* Date: 2024-01-10
* Web: https://github.com/Tomasman05/romb.git
* Licenc: MIT
*
*/
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.InputMismatchException;

import lan.zold.Romb;

public class RombTest {
    Romb romb;
    @BeforeTest
    public void setUp(){
        this.romb = new Romb();
    }
    @Test
    public void calcArea_30_35(){
        double actual = this.romb.calcArea(30,35);
        double expected = 516.2;
        Assert.assertEquals(actual, expected,0.1);
    }
    @Test
    public void calcArea_40_45(){
        double actual = this.romb.calcArea(40,45);
        double expected = 1131.4;
        Assert.assertEquals(actual, expected,0.1);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void calcArea_0_45(){
        this.romb.calcArea(0, 45);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void calcArea_40_0(){
        this.romb.calcArea(40, 0);
    }
    @Test
    public void calcPerim_5_5_5_5(){
        this.romb.calcPerim();
    }

}
