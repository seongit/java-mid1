package lang.immutable.address;

public class RefMain_2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImuutableAddress a = new ImuutableAddress("서울");
        ImuutableAddress b = a; // 참조값 대입을 막을 수 있는 방법은 없다. 왜? 자바가 그렇게 설계 되었기 때문에

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = new ImuutableAddress("부산");

        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
