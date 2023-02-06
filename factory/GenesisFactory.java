package factory;

public class GenesisFactory implements CarFactory {
    @Override
    public Car produceCar() {
        return new Genesis();
    }
}