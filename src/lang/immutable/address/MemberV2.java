package lang.immutable.address;

public class MemberV2 {

    private String name;

    private ImuutableAddress address;

    public MemberV2(String name, ImuutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(ImuutableAddress address) {
        this.address = address;
    }

    public ImuutableAddress getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
