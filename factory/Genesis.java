package factory;

public class Genesis implements Car {
    private static final String productName = "Genesis";

    @Override
    public String toString() {
        return productName;
    }
}