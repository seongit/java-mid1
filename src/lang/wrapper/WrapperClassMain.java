package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {

        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10); // 자바가 미리 만들어 놓은 객체를 사용하기 때문에 성능상 매우 빠르다.

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();

        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();

        System.out.println("longObj = " + longValue);

        System.out.println("비교");
        System.out.println("==:" + (newInteger == integerObj)); // 다른 참조를 바라보고 있기 때문에 false
        System.out.println("equals: " + newInteger.equals(integerObj)); // 내부 값으로 비교하기 때문에 true
    }

}
