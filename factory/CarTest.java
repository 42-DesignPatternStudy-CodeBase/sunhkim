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

    public static Car produceCar(String name) {
        Car car = null;
        if(name.equalsIgnoreCase("Sonata")) {
            SonataFactory factory = new SonataFactory();
            car = factory.produceCar();
        }
        else if(name.equalsIgnoreCase("Grandeur")) {
            GrandeurFactory factory = new GrandeurFactory();
            car = factory.produceCar();
        }
        else if(name.equalsIgnoreCase("Genesis")) {
            GenesisFactory factory = new GenesisFactory();
            car = factory.produceCar();
        }
        else {
            System.out.println("[WARN] There is no matching product type");
        }
        return car;
    }
}