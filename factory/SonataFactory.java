package factory;

public class SonataFactory implements CarFactory {
    @override
    public Car produceCar() {
        return new Sonata();
    }
}