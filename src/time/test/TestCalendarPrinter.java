package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요 : ");
        int month = sc.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate lastDayOfMonth = firstDayOfMonth.with(TemporalAdjusters.firstDayOfNextMonth());

        int start = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("lastDayOfMonth = " + lastDayOfMonth);

        System.out.println("Su Mo Tu We Th Fr Sa ");
        for (int i = 0; i < start ; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(lastDayOfMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());

            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println(); // 개행
            }

            dayIterator = dayIterator.plusDays(1);
        }


    }

}
