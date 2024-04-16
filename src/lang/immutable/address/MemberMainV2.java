package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImuutableAddress address = new ImuutableAddress("서울");

        MemberV2 회원A = new MemberV2("회원A", address);
        MemberV2 회원B = new MemberV2("회원B", address);

        System.out.println("memberA=" + 회원A);
        System.out.println("memberB=" + 회원B);

        // 회원 B의 주소를 부산으로 변경해야함
//        회원B.getAddress().setValue("부산"); // 불변이라 안됨

        회원B.setAddress(new ImuutableAddress("부산"));

        System.out.println("부산 -> 회원B.address");
        System.out.println("memberA=" + 회원A);
        System.out.println("memberB=" + 회원B);

    }
}
