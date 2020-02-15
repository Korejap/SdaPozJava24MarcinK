package zajecia4.fukcje;

import java.util.Scanner;

public class Zad2 {

    static String zamienKolejnosc (String text) {

        int dlugosc = text.length();

String wynik ="";
        for (int i = text.length() -1; i >=0 ; i--) {
            wynik = wynik + text.charAt(i);
        }

        return wynik;
      //      System.out.println(tabtextOdwortnie [i]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny wyraz:");
        String napis = scanner.nextLine();


        System.out.println(zamienKolejnosc(napis));



    }
}
