package chapter3.ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {} // 구현부는 있지만 구현 내용이 없다. 추상 메소드가 아니다. [훅메소드]

    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
