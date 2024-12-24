package nested;

public class ShadowingMain {
    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            // 지역 변수 호출됨
            System.out.println("value = " + value);

            // 인스턴스 멤버 호출됨
            System.out.println(this.value);

            // 바깥 클래스 인스턴스 멤버 호출됨
            System.out.println(ShadowingMain.this.value);

        }
    }

}
