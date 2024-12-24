package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstacneValue = 2;

    class Inner{
        private int innerInstacneValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(innerInstacneValue);

            // 외부의 인스턴스 멤버에 접근
            System.out.println(outInstacneValue);

            // 외부의 클래스 멤버에 접근
            System.out.println(outClassValue);
        }

    }
}
