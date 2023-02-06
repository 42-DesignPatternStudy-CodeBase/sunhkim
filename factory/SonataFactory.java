package factory;

public class SonataFactory implements CarFactory {
    @Override
    public Car produceCar() {
        return new Sonata();
    }
}