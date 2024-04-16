package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 회원A = new MemberV1("회원A", address);
        MemberV1 회원B = new MemberV1("회원B", address);

        System.out.println("memberA=" + 회원A);
        System.out.println("memberB=" + 회원B);

        회원B.getAddress().setValue("부산");

        System.out.println("부산 -> 회원B.address");
        System.out.println("memberA=" + 회원A);
        System.out.println("memberB=" + 회원B);

    }
}
