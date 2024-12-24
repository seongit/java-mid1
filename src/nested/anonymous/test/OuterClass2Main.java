package nested.anonymous.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        // 여기에서 NestedClass의 hell() 메서드를 호출하라.
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass innerClass = outer.new InnerClass();
        innerClass.hello();
    }
}
