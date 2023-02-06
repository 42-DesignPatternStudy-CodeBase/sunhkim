package factory;

public class GrandeurFactory implements CarFactory {
    @override
    public Car produceCar() {
        return new Grandeur();
    }
}