package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {

        ImmutableMyDate date = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = new ImmutableMyDate(2025, 1, 1);

        ImmutableMyDate date3 = date;
        System.out.println("date1 = " + date);
        System.out.println("date3 = " + date3);

        date = date.withYear(2025);
        System.out.println("date = " + date);
        System.out.println("date 3 = " + date3);

    }
}
