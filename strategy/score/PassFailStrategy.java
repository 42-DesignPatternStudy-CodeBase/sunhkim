package strategy.score;

public class PassFailStrategy implements GradeStrategy {

    @Override
    public String grade(int score) {
        if(score >= 60) {
            return "Pass";
        }
        else {
            return "Fail";
        }
    }
    
}
