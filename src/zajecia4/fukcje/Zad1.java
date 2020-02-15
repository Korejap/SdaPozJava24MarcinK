package zajecia4.fukcje;

import java.util.Scanner;

public class Zad1 {

    static int coutLastletterInString(String text) {
        // pobieramy ostatnia litere w napisie
        text = text.toLowerCase();
        char lastLetter = text.charAt(text.length() - 1);
        int counter = 0;
        for(int i = 0; i < text.length(); i++) {
            char litera = text.charAt(i);
            if(lastLetter == litera){
                // jezeli ostatnia litera zgadza sie z aktualna litera
                //to zwiekszamy licznik
                counter++;

            }

        }
        return counter;
    }

    public static void main(String[] args) {

        System.out.println("Podaj dowolny napis a ja policzę ilosc wystąpień ostatniej litery:");

        Scanner scanner = new Scanner(System.in);


        String napis = scanner.nextLine();

        //wywyłujemy funkcję

        int liczbaWystapien = coutLastletterInString(napis);
        System.out.println("Ostatnia litera wystąpiła " + liczbaWystapien + "razy");
    }
}
