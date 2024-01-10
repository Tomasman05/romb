package lan.zold;

public class Romb {
    public double calcArea(double side, double angle){

        return Math.pow(side, 2)*Math.sin(Math.toRadians(angle));
    }
}
