package oop.part2;

public interface ServiceStation {
    void check(Car[] cars);
    void check(Bicycle[] bicycles);
    void check(Truck[] trucks);
    void checkTransport(Transport[] transport);
}
