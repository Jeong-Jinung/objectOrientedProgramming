package chapter5.ch07;

public class ThreeDPrinter3 {

    private Object meterial;

    public Object getMeterial() {
        return meterial;
    }

    public void setMeterial(Object meterial) {
        this.meterial = meterial;
    }

    @Override
    public String toString() {
        return "재료는 Object 입니다.";
    }
}
