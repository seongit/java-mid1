package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        for (int i = 0; i < arr.length; i++) {
            String string = arr[i] + ":" + arr[i].length();
            System.out.println(string);
        }

    }
}
