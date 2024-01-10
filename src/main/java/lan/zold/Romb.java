package lan.zold;

import java.util.InputMismatchException;

public class Romb {
    public double calcArea(double side, double angle){
        if (side<=0) {
            throw new InputMismatchException();
        }
        return Math.pow(side, 2)*Math.sin(Math.toRadians(angle));
    }
}
