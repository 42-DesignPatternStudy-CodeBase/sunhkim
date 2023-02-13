package strategy.score;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score, boolean majorCode, boolean isPassFail) {
        Subject subject;

        if (isPassFail) {
            subject = new Subject(new PassFailStrategy());
        } else {
            if (majorCode) {
                subject = new Subject(new MajorStrategy());
            } else {
                subject = new Subject(new ElectiveStrategy());
            }
        }

        subject.setName(name);
        subject.setScorePoint(score);
        subject.setMajorCode(majorCode);
        subjectList.add(subject);
    }

    public void showGradeInfo() {
        for (Subject subject : subjectList) {
            System.out.println("학생 " + studentName + "의 " + subject.getName()
             + " 과목 성적은 " + subject.getScorePoint() + "점 이고, 학점은 "
             + subject.getGrade() + " 입니다.");
        }
    }
}
