package strategy.score;

public class StrategyTest {
    public static void main(String args[]) {
        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("국어", 100, false, false);
        studentLee.addSubject("수학", 100, true, false);

        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("국어", 55, true, false);
        studentKim.addSubject("수학", 55, false, false);
        studentKim.addSubject("영어", 100, false, false);

        Student studentPark = new Student(2000, "Park");

        studentPark.addSubject("코딩", 60, false, true);
        studentPark.addSubject("음악", 50, false, true);
       
        studentLee.showGradeInfo();
        System.out.println("================================================================");
        studentKim.showGradeInfo();
        System.out.println("================================================================");
        studentPark.showGradeInfo();
    }
}
