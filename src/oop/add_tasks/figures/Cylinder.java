package oop.add_tasks.figures;

public class Cylinder extends Roundish {
    protected double height;


    public double getHeight() {
        return height;
    }


    public void calculateCylinder() {
        volume = 3.14 * Math.pow(radius, 2) * height;
    }

    @Override
    public void calculate() {
        calculateCylinder();
    }
}
