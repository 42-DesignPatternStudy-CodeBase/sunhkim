package factory;

public class Sonata implements Car {
    private static final String productName = "Sonata";

    @Override
    public String toString() {
        return productName;
    }
}