package lang.immutable.address;

public class ImuutableAddress {

    private final String value;

    public ImuutableAddress(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }

}
