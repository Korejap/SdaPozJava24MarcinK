package Zajecia7;

import java.time.Duration;
import java.time.Instant;

public class InstantData {


    public static void main(String[] args) {
        java.time.Instant instant = java.time.Instant.now();
        System.out.println(instant);

        java.time.Instant instant1 = java.time.Instant.parse("2019-11-25T09:28:10.179Z");
        instant1 = instant1.minus(Duration.ofDays(05));
        System.out.println(instant1);

        java.time.Instant instant2 = instant1.plus(Duration.ofHours(8));
        System.out.println(instant2);

        boolean check = instant1.isBefore(instant2);
        System.out.println(check);
    }
}



