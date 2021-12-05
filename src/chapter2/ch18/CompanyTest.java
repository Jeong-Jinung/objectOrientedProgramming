package chapter2.ch18;

import java.util.Calendar;

public class CompanyTest {

    public static void main(String[] args) {

        /**
         * 싱글톤으로 된 인스턴스 가져오기
         */
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println("company1 = " + company1);
        System.out.println("company2 = " + company2);

        Calendar calendar = Calendar.getInstance();
    }
}
