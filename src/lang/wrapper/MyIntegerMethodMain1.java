package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {

        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.compareTo(5); // 자기 자신의 값과 외부의 값을 비교하여 반환함
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20);

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);

    }


}
