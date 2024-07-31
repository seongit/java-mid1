package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        // 남은 기간: x년 x개월 x일 형식으로 출력한다.
        Period between = Period.between(startDate, endDate);
        System.out.println("남은 기간: " + between.getYears() + "년 " + between.getMonths() + "월 " + between.getDays() + "일");
        // 디데이: x일 남은 형식으로 출력한다.
        System.out.println("디데이: " + ChronoUnit.DAYS.between(startDate,endDate) + "일");


    }
}
