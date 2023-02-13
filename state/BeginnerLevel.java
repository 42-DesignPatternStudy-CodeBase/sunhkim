package state;

public class BeginnerLevel implements PlayerLevel {
    private static BeginnerLevel instance;

    public static BeginnerLevel getInstance() {
        if (instance == null) {
            instance = new BeginnerLevel();
        }
        return instance;
    }

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("현재 레벨은 Beginner 입니다.");
    }    
}
