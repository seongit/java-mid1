package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) { //`compareTo()` 메서드를 클래스 내부로 캡슐화 == 인스턴스에 소속된 메서드로 만듦
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        }else {
            return 0;
        }
    }

    public String toString() {
        return String.valueOf(value); // 숫자를 문자로 변경
    }

}
