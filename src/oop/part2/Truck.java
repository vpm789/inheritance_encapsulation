package oop.part2;

public class Truck extends GeneralPropertiesTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service() {
        checkEngine();
        checkTrailer();
    }
}