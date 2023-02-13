package state;

public class AdvancedLevel implements PlayerLevel{
    private static AdvancedLevel instance;

    public static AdvancedLevel getInstance() {
        if (instance == null) {
            instance = new AdvancedLevel();
        }
        return instance;
    }

    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 Jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("현재 레벨은 Advanced 입니다.");
    }
}
