package enumeration.ex2;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade();
    // 회원 등급을 다루는 클래스를 만들고, 각각의 회원 등급별로 상수를 선언한다.
    // 각각의 상수마다 별도의 인스턴스를 생성하고, 생성한 인스턴스를 대입한다.
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();
}
