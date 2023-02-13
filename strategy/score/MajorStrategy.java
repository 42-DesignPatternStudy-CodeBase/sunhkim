package strategy.score;

public class MajorStrategy implements GradeStrategy {

    @Override
    public String grade(int score) {
        switch(score / 10) {
            case 10:
            case 9:
                if (score >= 95) {
                    return "S";
                } else {
                    return "A";
                }
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }
}
