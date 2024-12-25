package exception.basic.unchecked;

public class Service {
    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 처리 로직");
    }

    /**
     * 예외를 잡지 않아도 된다. 자연스럽게 상위로 넘어간다.
     * throws 예외 선언을 하지 않아도 된다.
     */
    public void callThrow() {
        client.call();
    }
}
