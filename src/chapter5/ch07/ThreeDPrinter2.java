package chapter5.ch07;

public class ThreeDPrinter2 {

    private Plastic meterial;

    public Plastic getMeterial() {
        return meterial;
    }

    public void setMeterial(Plastic meterial) {
        this.meterial = meterial;
    }

    @Override
    public String toString() {
        return "재료는 Plastic 입니다.";
    }
}
