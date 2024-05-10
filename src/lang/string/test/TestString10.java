package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] fruitsArr = fruits.split(",");
        for (int i = 0; i < fruitsArr.length; i++) {
            System.out.println(fruitsArr[i]);
        }

        String result = String.join("->", fruitsArr);
        System.out.println("joinedString = " + result);
    }
}
