package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstnaceValue = 2;

    static class Nested{
        private int nestedInstnaceValue = 1;

        public void print() {

            // 자신의 멤버에 접근
            System.out.println(nestedInstnaceValue);

            // 바깥 클래스의 인스턴스 멤버에는 접근 불가
            // System.out.println(outInstnaceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. private도 가능
            System.out.println(outClassValue);

        }
    }
}
