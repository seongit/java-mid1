package lang.string.builder;

public class StringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            str.append("Hello Java");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("result = " + str);
        System.out.println("time = " + (endTime - startTime));
    }
}
