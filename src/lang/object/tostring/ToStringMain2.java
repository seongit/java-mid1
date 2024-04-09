package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car model1Y = new Car("Model1Y");
        Dog dog1 = new Dog("멍멍1", 2);
        Dog dog2 = new Dog("멍멍2", 5);

        System.out.println("1.단순 ToString 호출");
        System.out.println(model1Y.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(model1Y);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(model1Y);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);


        int i = System.identityHashCode(dog1);
        System.out.println(i);

        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(refValue);
        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println(refValue2);
    }
}
