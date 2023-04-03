package oop.add_tasks;

public class Main {
    public static void main(String[] args) {
        Shape[] allFigures = {
                new Ball(4, 2),
                new Ball(3, 1.5),
                new Ball(4, 2.5),
                new Cylinder(2, 2, 3),
                new Cylinder(4, 3, 5),
                new Pyramid(3, 2, 4),
                new Pyramid(5, 3, 6),
                new Pyramid(4, 3, 3),
        };
        Box box1 = new Box(36);
        System.out.println(box1.add(allFigures));
    }
}
