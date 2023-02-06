package factory;

public class GrandeurFactory implements CarFactory {
    @Override
    public Car produceCar() {
        return new Grandeur();
    }
}