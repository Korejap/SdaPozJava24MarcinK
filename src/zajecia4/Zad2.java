package zajecia4;

import java.util.Random;
import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();
        // random - losowanie, random + enter
        // rand.nextInt(paramet)
        Random rand = new Random();
        rand.nextInt(10);

//        System.out.println((rand.nextInt(10)));
//        System.out.println((rand.nextInt(10)));
//        System.out.println((rand.nextInt(10)));
//        System.out.println((rand.nextInt(10)));

        //dwie tablicy
        //"tab o rozmiarze uzytkownika, II o rozmiarze 11 dla zliczania wystapien od 0-10, 11 cyfr
        //wypelnianie tablicy wartosciami losowymi


        int[] tab = new int[size];
        System.out.println("Wylosowane liczby: ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt(11) + 1;
            System.out.print(tab[i] + ", ");
        }

        System.out.println();
        int[] wys = new int[11];

        for (int i = 0; i < tab.length; i++) {
            System.out.print( tab[i] + ", ");
           int index = tab[i];
            wys[index] ++;
//todo je, trzeba to ogarnac, lepiej spojrzec na co co on zrobil bo ja mam to troche zle
//wartosc tablicy tab - to jest wartosc tab wys
            // np. jesli bedzie 5-> to w tab wys [5] nalezy inkrementowac aktualna wartosc
        }
        System.out.println();
        System.out.println( "Wystąpienia liczb:");
        for (int i = 1; i < wys.length; i++) {
            System.out.println(i + " - " + wys[i]);
//petla for each, gdy nie potrzebujemy konkretnego indesku np tablicy
//            for(int:liczba : liczby){
//            System.out.println((liczba + "' "));
//        }
        }
    }
}
