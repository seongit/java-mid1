package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopAnswer {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5 ; i++) {
            LocalDate plus = date.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println(plus);
        }
    }
}
