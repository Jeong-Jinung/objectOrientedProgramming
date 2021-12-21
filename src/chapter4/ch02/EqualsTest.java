package chapter4.ch02;

public class EqualsTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");

        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

//        String str1 = new String("abc");
//        String str2 = new String("abc");
//
//        System.out.println(str1.hashCode());
//        System.out.println(str2.hashCode());
//
//        Integer i = 100;
//        System.out.println(i.hashCode());

        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(std2));

        Student copy = (Student)std1.clone(); // 물리적으로 달라짐
        copy.setStudentName("Kim");

        System.out.println("==============================");

        System.out.println(std1.toString());
        System.out.println(copy.toString());

        System.out.println(System.identityHashCode(std1));
        System.out.println(System.identityHashCode(copy));

    }


}
