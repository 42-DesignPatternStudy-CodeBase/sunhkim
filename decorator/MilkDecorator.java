package decorator;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Berverage berverage) {
        super(berverage);
    }

    @Override
    public String add() {
        return super.add() + " Adding Milk";
    }
}