package templete;

public abstract class Car {
    
	protected void startCar() {
		System.out.println("시동을 켭니다.");
	}
	protected abstract void drive();
	protected abstract void turn();
	protected abstract void stop();
	protected void turnOff() {
		System.out.println("시동을 끕니다.");
	}

    public final void run() {
        startCar();
        drive();
		turn();
        stop();
        turnOff();
    }
}
