package time.test;

import java.time.LocalDate;

public class TestLoopPlus {
    public static void main(String[] args) {
        //2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력
        LocalDate date = LocalDate.of(2024, 1, 1);

        for (int i = 0; i < 5; i++) {
            date = date.plusWeeks(2);
            System.out.println(date);
        }
    }
}
