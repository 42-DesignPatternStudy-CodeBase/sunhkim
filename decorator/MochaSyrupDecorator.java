package decorator;

public class MochaSyrupDecorator extends Decorator {
    public MochaSyrupDecorator(Berverage berverage) {
        super(berverage);
    }

    @Override
    public String add() {
        return super.add() + " Adding Mocha Syrup";
    }
}