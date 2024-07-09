package enumeration.ref3;



public class EnumRefMain3 {
    public static void main(String[] args) {
        int price = 10000;

        // `Grade.values()` 를 사용하면 `Grade` 열거형의 모든 상수를 배열로 구할 수 있다.
        Grade[] grades = Grade.values();

        for (Grade grade : grades) {
            printDiscount(grade, price);
        }

    }

    private static void printDiscount(Grade grade, int price) {
        // `grade.name()` 을 통해서 ENUM의 상수 이름을 사용할 수 있다.
        System.out.println(grade.name() + "등급의 할인 금액: " + grade.discount(price));
    }

}
