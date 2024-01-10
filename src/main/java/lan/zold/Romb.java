/*
* File: Romb.java
* Author: Vitovszki Tamás
* Copyright: 2024, Vitovszki Tamás 
* Date: 2024-01-10
* Web: https://github.com/Tomasman05/romb.git
* Licenc: MIT
*
*/
package lan.zold;

import java.util.InputMismatchException;

public class Romb {
    public double calcArea(double side, double angle){
        if (side<=0 || angle<=0) {
            throw new InputMismatchException();
        }
        return Math.pow(side, 2)*Math.sin(Math.toRadians(angle));
    }
    public double calcPerim(double side){
        if (side<=0) {
            throw new InputMismatchException();
        }
        return 4*side;
    }
}
