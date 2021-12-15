package chapter3.ch10;

public class CarTest {

    public static void main(String[] args) {

        Car aicar = new AICar();
        aicar.run();

        System.out.println("================================");

        Car mCar = new ManualCar();
        mCar.run();
    }
}
