package Uri.HackerRankBest.DateAndTime;

import java.time.LocalDate;

public class Result {

    public static String findDay(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().name();

    }
}
