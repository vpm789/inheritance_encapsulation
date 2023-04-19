package oop.add_tasks.figures;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(125);


        Pyramid pyramid1 = new Pyramid();
        pyramid1.square = 2;
        pyramid1.height = 1;

        Ball ball1 = new Ball();
        ball1.radius = 3;

        Cylinder cylinder1 = new Cylinder();
        cylinder1.radius = 2;
        cylinder1.height = 3;

        Calculator calculator = new Calculator();
        calculator.calculate(pyramid1);
        calculator.calculate(ball1);
        calculator.calculate(cylinder1);
        System.out.println(box1.add(pyramid1));
        System.out.println(box1.add(ball1));
        System.out.println(box1.add(cylinder1));

    }
}
