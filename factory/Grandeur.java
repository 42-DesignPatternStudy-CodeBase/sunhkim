package factory;

public class Grandeur implements Car {
    private static final String productName = "Grandeur";

    @Override
    public String toString() {
        return productName;
    }
}