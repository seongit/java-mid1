package enumeration.ref1;

public class ClassGrade {

    // 회원 등급을 다루는 클래스를 만들고, 각각의 회원 등급별로 상수를 선언한다.
    // 각각의 상수마다 별도의 인스턴스를 생성하고, 생성한 인스턴스를 대입한다.
    // 상수를 정의할 때 각각의 등급에 따른 할인율( `discountPercent` )이 정해진다.

    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    // 생성자를 통해서만 `discountPercent` 를 설정
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    private final int discountPercent;

    public int getDiscountPercent() {
        return discountPercent;
    }
}
