package oop.add_tasks;

public abstract class Roundish extends Shape{
    protected double radius;

    public Roundish(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
