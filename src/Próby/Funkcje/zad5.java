package Próby.Funkcje;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class zad5 {

    static void sprawdzamNawiasy(String text) {
        int dlugosc = text.length();
        int lewyNawias = 0, prawyNawias = 0;
        char nawiasP = ')', nawiasL = '(';

        for (int i = 0; i < dlugosc; i++) {
            if (text.charAt(i) == nawiasP) {
                prawyNawias++;
            } else if (text.charAt(i) == nawiasL) {
                lewyNawias++;
            }
        }
        if (lewyNawias == prawyNawias) {
            System.out.println("Ok");

        } else {
            System.out.println("Nain!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rownanie: ");
        String text = scanner.nextLine();
        sprawdzamNawiasy(text);
    }
}
