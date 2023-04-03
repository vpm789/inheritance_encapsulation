package oop.add_tasks;

public class Cylinder extends Roundish{
    private double height;

    public Cylinder(double volume, double radius, double height) {
        super(volume, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
