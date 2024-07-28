package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 7, 28, 14, 24, 59);
        System.out.println("dt.get(ChronoField.YEAR) = " + dt.get(ChronoField.YEAR));
        System.out.println("dt.get(ChronoField.MONTH_OF_YEAR) = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("dt.get(ChronoField.DAY_OF_MONTH) = " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("dt.get(ChronoField.HOUR_OF_DAY) = " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("ChronoField.MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("dt.get(ChronoField.SECOND_OF_MINUTE) = " + dt.get(ChronoField.SECOND_OF_MINUTE));

        // 편의 메서드 사용
        System.out.println("편의 메서드에 사용");

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth()); //Month 객체 반환 (e.g.JULY)
        System.out.println("dt.getMonth() = " + dt.getMonthValue()); // 날짜 반환
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());

        // 편의 메서드에 없음
        System.out.println("편의 메서드에 없음");
        System.out.println("dt.get(ChronoField.MINUTE_OF_DAY) = " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("dt.get(ChronoField.SECOND_OF_DAY) = " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
