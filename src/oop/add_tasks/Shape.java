package oop.add_tasks;

public abstract class Shape {
    protected double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
