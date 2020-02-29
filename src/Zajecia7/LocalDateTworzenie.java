package Zajecia7;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTworzenie {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate specialDay = LocalDate.of(2022, 3, 11);
        System.out.println(specialDay);
        LocalDate specialDay2 = LocalDate.of(2022, Month.FEBRUARY,15);
        System.out.println(specialDay2);
        String myBirthday = "1985-07-24";
        LocalDate mybirthdayLocalDate = LocalDate.parse(myBirthday);
        //parse na podstawie textu tworzy date
        System.out.println(mybirthdayLocalDate);
        LocalDate tommorow = LocalDate.now().plusDays(1);
        System.out.println(tommorow);
    }
}
