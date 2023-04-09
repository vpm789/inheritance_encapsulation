package oop.add_tasks.figures;

public class Pyramid extends Shape {
    protected double square;
    protected double height;

    public double getSquare() {
        return square;
    }

    public double getHeight() {
        return height;
    }

    public void calculatePyramid() {
        volume = (square * height) / 3;
    }

    @Override
    public void calculate() {
        calculatePyramid();
    }
}
