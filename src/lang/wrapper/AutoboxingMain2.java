package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {

        // 자바는 이런 문제를 해결하기 위해 자바 1.5부터 오토 박싱(Auto-boxing), 오토 언박싱(Auto-Unboxing)을 지원한다.
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
