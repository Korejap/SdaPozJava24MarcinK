package Zajecia7;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.TimeZone;

public class Strefyzczasowe {
    public static void main(String[] args) {


        String[] ids = TimeZone.getAvailableIDs();
        System.out.println(Arrays.toString(ids));

        ZoneId New_York = ZoneId.of("America/New_York");
        ZoneId London = ZoneId.of("Europe/London");
        ZoneId Budapest = ZoneId.of("Europe/Budapest");
        ZoneId Tokyo = ZoneId.of("Asia/Tokyo");

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now(New_York));
        System.out.println(ZonedDateTime.now(London));
        System.out.println(ZonedDateTime.now(Budapest));
        System.out.println(ZonedDateTime.now(Tokyo));


    }
}
