package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception{
        Class helloClass = Class.forName("lang.clazz.Hello"); // 사용자에게 동적으로 className을 입력 받아서 사용할 수 있음
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance(); // 생성자를 얻어서 객체를 생성
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
