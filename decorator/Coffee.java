package decorator;

public class Coffee implements Berverage {
    protect String bean = "";

    public Coffee(String bean) {
        this.bean = bean;
    }

    @Override
    public String add() {
        return bean;
    }
}