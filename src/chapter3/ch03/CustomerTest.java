package chapter3.ch03;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println("customerLee.showCustomerInfo() = " + customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        customerKim.showCustomerInfo();
        System.out.println("customerKim.showCustomerInfo() = " + customerKim.showCustomerInfo());


    }
}
