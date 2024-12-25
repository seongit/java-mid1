package exception.basic.unchecked;

/**
 * RuntimeException을 상속 받으면 언체크드 예외가 된다.
 */
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
