package oop.part2;

public class ServiceStationTransports implements ServiceStation {
    @Override
    public void check(Car[] cars) {
        checkTransport(cars);
    }
    @Override
    public void check(Bicycle[] bicycles) {
        checkTransport(bicycles);
    }
    @Override
    public void check(Truck[] trucks) {
        checkTransport(trucks);
    }

    public void checkTransport(Transport[] transport) {
        for (int i = 0; i < transport.length; i++) {
            if (transport[i].getClass() == Car.class) {
                System.out.println("Обслуживаем " + transport[i].getModelName());
                for (int j = 0; j < transport[i].getWheelsCount(); j++) {
                    transport[i].updateTyre();
                }
                transport[i].checkEngine();
            } else if (transport[i].getClass() == Truck.class) {
                System.out.println("Обслуживаем " + transport[i].getModelName());
                for (int j = 0; j < transport[i].getWheelsCount(); j++) {
                    transport[i].updateTyre();
                }
                transport[i].checkEngine();
                transport[i].checkTrailer();
            } else {
                System.out.println("Обслуживаем " + transport[i].getModelName());
                for (int j = 0; j < transport[i].getWheelsCount(); j++) {
                    transport[i].updateTyre();
                }
            }
        }
    }
}
