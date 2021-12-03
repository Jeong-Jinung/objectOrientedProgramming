package chapter2.ch10;

public class BirthDay {

    /**
     * 객체의 역할에 문제가 생길 수 있기 때문에 private을 사용하는 것이 좋다.
     */
    private int day;
    private int month;
    private int year;

    private boolean isValid; // 기본값 : false

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if (isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }

}
