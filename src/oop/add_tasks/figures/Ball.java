package oop.add_tasks.figures;

public class Ball extends Roundish {

    public void calculateBall() {
        volume = (4 * 3.14 * Math.pow(radius, 3)) / 3;
    }

    @Override
    public void calculate() {
        calculateBall();
    }
}
