package Zajecia7;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ModyfikowanieDaty {
    public static void main(String[] args) {


        ZonedDateTime dataCzas = ZonedDateTime.now();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String tekst = dataCzas.format(f);
        System.out.println(tekst);



    }
    // ziana wyswietlania z roku na dzien
    void formatDataCzas(){
        //LocalDateTime dataCzas = LocalDateTime.now();
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate l1 = LocalDate.parse("2018-06-22", f1);
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String tekst1 = l1.format(f2);
        System.out.print(tekst1);
    }
}
