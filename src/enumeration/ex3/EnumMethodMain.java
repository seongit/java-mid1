package enumeration.ex3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        Grade[] values = Grade.values();

        System.out.println("values = " + Arrays.toString(values)); // 배열 내부의 값을 출력할 떄 사용

        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal=" + value.ordinal() );
        }

        // String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 오버라이딩 가능

    }
}
