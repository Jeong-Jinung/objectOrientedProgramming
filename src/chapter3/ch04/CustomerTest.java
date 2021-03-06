package chapter3.ch04;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + price);

        Customer vc = new VIPCustomer(12345, "noname");
        vc.calcPrice(1000); // 어떤 calcPrice를 호출할까?
        /**
         * 가상함수 / 가상 메서드
         * 실제 인스턴스의 메서드가 호출 된다.
         */
        System.out.println(vc.calcPrice(1000));


    }
}
