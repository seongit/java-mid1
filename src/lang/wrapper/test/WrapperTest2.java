package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
      String[] array = {"1.5", "2.5","3.0"};
        double result = 0L;
        for (String string : array) {
            result += Double.parseDouble(string);
        }

        System.out.println(result);
    }
}
