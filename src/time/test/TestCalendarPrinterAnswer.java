package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinterAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = sc.nextInt();

        System.out.print("월을 입력하세요 : ");
        int month = sc.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeek = date.getDayOfWeek(); // 요일
        LocalDate with = date.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("1일: " + dayOfWeek);
        System.out.println("마지막 요일: " + with.getDayOfWeek());
        System.out.println("마지막 날짜: " + with.getDayOfMonth());

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");

        for (int i = 0; i < offsetWeekDays ; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;

        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());

            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }


    }

}
