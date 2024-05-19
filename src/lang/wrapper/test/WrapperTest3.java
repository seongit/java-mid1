package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1); // String -> Integer

        // Integer -> int (오토 언박싱)
        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        // Integer -> int
        int intValue2 = integer1.intValue();

        // int -> Integer (오토 박싱)
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);

        // int -> Integer
        Integer integer3 = Integer.valueOf(integer2);

    }
}
