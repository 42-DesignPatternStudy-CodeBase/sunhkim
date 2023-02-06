package factory;

public class CarTest {
    public static void main(String[] args) {
        Car sonata = produceCar("Sonata");
        System.out.println(sonata);

        Car grandeur = produceCar("Grandeur");
        System.out.println(grandeur);

        Car genesis = produceCar("Genesis");
        System.out.println(genesis);
    }

    public Car produceCar(String name) {
        Car car = null;
        if(name.equalsIgnoreCase("Sonata")) {
            SonataFactory factory = new SonataFactory();
            car = factory.produceCar();
        }
        else if(name.equalsIgnoreCase("Grandeur")) {
            SonataFactory factory = new SonataFactory();
            car = factory.produceCar();
        }
        else if(name.equalsIgnoreCase("Genesis")) {
            SonataFactory factory = new SonataFactory();
            car = factory.produceCar();
        }
        else {
            System.out.println("[WARN] There is no matching product type");
        }
        return car;
    }
}