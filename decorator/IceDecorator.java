package decorator;

public class IceDecorator extends Decorator {
    public IceDecorator(Berverage berverage) {
        super(berverage);
    }

    @Override
    public String add() {
        return super.add() + " Adding Ice";
    }
}