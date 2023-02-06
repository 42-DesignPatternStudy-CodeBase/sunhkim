package decorator;

public class WhippedCreamDecorator extends Decorator {
    public WhippedCreamDecorator(Berverage berverage) {
        super(berverage);
    }

    @Override
    public String add() {
        return super.add() + " Adding WhippedCream";
    }
} 