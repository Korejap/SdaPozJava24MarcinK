package Zajecia7;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitAlternatywa {
    public static void main(String[] args) {


        LocalDateTime myFatherB = LocalDateTime.of(1955, Month.FEBRUARY, 28, 7, 55);
        LocalDateTime myB = LocalDateTime.of(1985, 7, 24, 12, 15);

        long years = ChronoUnit.YEARS.between(myFatherB, myB);
        long months = ChronoUnit.MONTHS.between(myFatherB, myB);
        long weeks = ChronoUnit.WEEKS.between(myFatherB, myB);
        long days = ChronoUnit.DAYS.between(myFatherB, myB);
        long hours = ChronoUnit.HOURS.between(myFatherB, myB);
        long minutes = ChronoUnit.MINUTES.between(myFatherB, myB);
        long seconds = ChronoUnit.SECONDS.between(myFatherB, myB);
        long millis = ChronoUnit.MILLIS.between(myFatherB, myB);
        long nanos = ChronoUnit.NANOS.between(myFatherB, myB);


    }
}
