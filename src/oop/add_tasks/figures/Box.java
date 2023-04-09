package oop.add_tasks.figures;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private double volume;
    private double freeVolume; //объем оставшегося места
    private List<Shape> shapeList = new ArrayList<Shape>();

    public Box(double volume) {
        this.volume = volume;
        this.freeVolume = volume;
    }

    public boolean add(Shape newShape) {
        if (newShape.getVolume() > freeVolume) { // true в случае если у нас нет места для новой фигуры
            return false;
        }
        shapeList.add(newShape);
        freeVolume -= newShape.getVolume();
        return true;
    }
}
