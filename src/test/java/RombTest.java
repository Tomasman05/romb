import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;

public class RombTest {
    Romb romb;
    @BeforeTest
    public void setUp(){
        this.romb = new Romb();
    }
    @Test
    public void calcArea_30_35(){
        this.romb.calcArea();
    }
}
