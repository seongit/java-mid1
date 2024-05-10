package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {

        String email = "hello@example.com";
        String[] splitArr = email.split("@");

        System.out.println("ID:" + splitArr[0]);
        System.out.println("Domain: " + splitArr[1]);
    }
}
