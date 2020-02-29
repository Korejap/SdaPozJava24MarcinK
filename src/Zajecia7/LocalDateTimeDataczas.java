package Zajecia7;

import java.time.*;

public class LocalDateTimeDataczas {

    public static void main(String[] args) {
        // milisekudny

        LocalDateTime localDateTime1 = LocalDateTime.of(2019, 1,2,13,15,20,123456789);
        //miesiac
        LocalDateTime localDateTime2 = LocalDateTime.of(2019, Month.DECEMBER, 24, 17, 0, 0, 123456789);

        //local dalte + local date
        LocalDate date = LocalDate.of(2020, 07, 11);
        LocalTime time = LocalTime.of(15,45);
        LocalDateTime localDatetime3 = LocalDateTime.of(date, time);

        DayOfWeek dayOfWeek = localDateTime1.getDayOfWeek();
        int dayOfYear = localDateTime2.getDayOfYear();
        Month month = localDatetime3.getMonth();
        int monthInt = localDatetime3.getMonthValue();
    }
}
