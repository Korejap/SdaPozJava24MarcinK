package Zajecia7;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class OkresICzasTrwania {

    public static void main(String[] args) {

        LocalDateTime myFatherB = LocalDateTime.of(1955, Month.FEBRUARY, 28, 7, 55);
        LocalDateTime myB = LocalDateTime.of(1985, 7, 24, 12, 15);
        Duration duration = Duration.between(myFatherB,myB);
        System.out.println(duration.getSeconds());

        Period period = Period.between(myFatherB.toLocalDate(), myB.toLocalDate());
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
