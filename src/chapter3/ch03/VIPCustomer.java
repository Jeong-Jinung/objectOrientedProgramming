package chapter3.ch03;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

        System.out.println("VIPCustomer(int, String) call");
    }

    /*
    public VIPCustomer() {
//        super(); // 없으면 자동으로 상위 클래스의 생성자를 컴파일러가 넣어준다.
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer() call");
    }
    */

    public double getSalesRatio() {
        return salesRatio;
    }

    public void setSalesRatio(double salesRatio) {
        this.salesRatio = salesRatio;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
