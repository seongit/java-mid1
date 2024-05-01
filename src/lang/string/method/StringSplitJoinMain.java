package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] splitStr = str.split(",");

        // join() 사용하지 않았을 경우
        String joinStr = "";
        for (int i = 0; i < splitStr.length; i++) {
            joinStr += splitStr[i];
            if (i != splitStr.length - 1) {
                joinStr += "-";
            }
        }
        System.out.println("joinStr :" + joinStr);

        // join() 사용할 경우
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열: " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr); // 배열도 가능함
        System.out.println("result = " + result);
    }
}
