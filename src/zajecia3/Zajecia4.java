package zajecia3;

import java.util.Scanner;

public class Zajecia4 {

    public static void main(String[] args) {

        // zapytaj uzytkownika o dowolny napis
        //policzy liczbe znakow ze spacja lub bez
        //wyswietl na koncu wynik

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolny napis: ");


        String text = scanner.nextLine();
        //zliczanie dlugosci napisu bez spacji
        //metody: pobieranie dlugosci napisu, wybieranie litery;
        int licznik = 0;
        for(int i= 0;  i < text.length(); i++) {
            // pobierz 1 znak
            char znak = text.charAt(i);
            System.out.println("Znak na pozycji" +i + "to: " +znak);
            //jezeli dany znak jest litera czyli nie jest spacja to go zliczamy
            if (znak != ' '){
                licznik++;
            }
        }
        System.out.println("Dlugosc tekstu bez spacji to: " + licznik);
        System.out.println("Długosc całego tekstu ze spacjami to: " + text.length());

//wyświetl napis zapisany malymi i duzymi literami
        System.out.println("Tekst małymi literami to: " + text.toLowerCase());
        System.out.println("Tekst duzymi literami to: "+ text.toUpperCase() );
    }

}
