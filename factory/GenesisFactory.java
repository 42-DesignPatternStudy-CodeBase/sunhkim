package factory;

public class GenesisFactory implements CarFactory {
    @override
    public Car produceCar() {
        return new Genesis();
    }
}