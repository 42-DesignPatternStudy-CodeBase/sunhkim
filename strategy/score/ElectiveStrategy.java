package strategy.score;

public class ElectiveStrategy implements GradeStrategy {

    @Override
    public String grade(int score) {
        switch(score / 10) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                if (score >= 55) {
                    return "D";
                } else {
                    return "F";
                }
        }
    }
    
}
