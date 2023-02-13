package strategy.score;

public class Subject {
    private String name;
    private int scorePoint;
    private boolean majorCode;

    private GradeStrategy gradeStrategy;

    public Subject(GradeStrategy gradeStrategy) {
        this.gradeStrategy = gradeStrategy;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getScorePoint() {
        return scorePoint;
    }
    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }

    public boolean isMajorCode() {
        return majorCode;
    }
    public void setMajorCode(boolean majorCode) {
        this.majorCode = majorCode;
    }

    public String getGrade() {
        return gradeStrategy.grade(scorePoint);
    }
}
