package observerPattern;

public class DigitObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
        System.out.println("Digit Observer Updated: " + generator.getNumber());
	}
}
