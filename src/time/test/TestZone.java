package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        // 서울의 회의 시간은 2024년 1월 1일 오전 9시다. 이때 런던, 뉴욕의 회의 시간을 구해라.
        LocalDateTime seoul = LocalDateTime.of(2024, 1, 1, 9, 0);
        ZonedDateTime seoul2 = ZonedDateTime.of(seoul, ZoneId.of("Asia/Seoul"));
        ZonedDateTime utc = seoul2.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime nyc = seoul2.withZoneSameInstant(ZoneId.of("America/New_York"));


        System.out.println("서울의 회의 시간: " + seoul2);
        System.out.println("런던의 회의 시간: " + utc);
        System.out.println("뉴욕의 회의 시간: " + nyc);
    }
}
