package oop.add_tasks;

public class Box {
    private double volume;

    public Box(double volume) {
        this.volume = volume;
    }

    public boolean add(Shape[] allFigures) {
        boolean place = true;
        double currentVolume = 0;
        for (int i = 0; i < allFigures.length; i++) {
            currentVolume = currentVolume + allFigures[i].getVolume();
            if (volume < currentVolume) {
                place = false;
                break;
            }
        }
        return place;
    }
}
