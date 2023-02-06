package decorator;

public class Decorator implements Berverage {
    private Berverage berverage;

    public Decorator(Berverage berverage) {
        this.berverage = berverage;
    }

    @Override
    public String add() {
        return berverage.add();
    }
}