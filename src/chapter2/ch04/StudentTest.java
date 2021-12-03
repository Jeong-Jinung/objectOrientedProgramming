package chapter2.ch04;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee /*참조변수*/ = new Student(); // 인스턴스 생성

        studentLee.studentId = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentId = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 성남시";

        studentKim.showStudentInfo();

        System.out.println("studentKim = " + studentKim);
        System.out.println("studentLee = " + studentLee);
    }

}
