package Chapter2.ch09;

public class SubjectTest {

    public static void main(String[] args) {

        Student studentLee = new Student(100, "Lee");
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 99);

        studentLee.showScoreInfo();

        Student studentKim = new Student(200, "Kim");
        studentKim.setKoreaSubject("국어", 50);
        studentKim.setMathSubject("수학", 65);

        studentKim.showScoreInfo();

    }
}
