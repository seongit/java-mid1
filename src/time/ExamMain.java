package time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ExamMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.of(2024,07,28,15, 0, 0);

        Duration between1 = Duration.between(now, end);
        long minutes = between1.toMinutes();
        if(minutes > 0){
            System.out.println("General's House 가기까지 ✈️" + between1.toMinutes() + "분 남았당");
        }else{
            long days = ChronoUnit.DAYS.between(now, end);
            System.out.println("General's House 다녀온지 " + Math.abs(days) + "일 지났당.");
        }
    }
}
