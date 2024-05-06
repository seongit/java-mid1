package lang.string.builder;

public class LoopStringMain1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += "Hello Java";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + str);
        System.out.println("time = " + (endTime - startTime));
    }
}
