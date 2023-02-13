package strategy.score;

public class ElectiveStrategy implements GradeStrategy {

    @Override
    public String grade(int score) {
        switch(score / 10) {
            case 10:
                return "A";
            case 9:
                return "B";
            case 8:
                return "C";
            case 7:
                return "D";
            default:
                return "F";
        }
    }
    
}
