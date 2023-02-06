package decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Berverage KenyaAmericano = new Coffee("Kenya");
        System.out.println(KenyaAmericano.add());

        Berverage KenyaLatte = new MilkDecorator(new Coffee("Kenya"));
        System.out.println(KenyaLatte.add());

        Berverage KenyaMochaLatte = new MochaSyrupDecorator(new MilkDecorator(new Coffee("Kenya")));
        System.out.println(KenyaMochaLatte.add());

        Berverage EriopiaAmericano = new WhippedCreamDecorator(new MochaSyrupDecorator(new MilkDecorator(new Coffee("Eriopia"))));
        System.out.println(EriopiaAmericano.add());

        Berverage EriopiaIceAmericano = new IceDecorator(new Coffee("Eriopia"));
        System.out.println(EriopiaIceAmericano.add());
    }
}