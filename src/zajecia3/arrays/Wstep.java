package zajecia3.arrays;

import java.util.Scanner;

public class Wstep {

    public static void main(String[] args) {
        // [] - tablica
        //tworzenie tablicy 10 elemtentow
        int[] liczby = new int[10];
        //wpisywanie wartosci
        liczby[0] = 5;
        liczby[1] = 7;
        liczby[2] = -5;
        liczby[3] = -2;
        liczby[4] = -1;
        liczby[4] = 0;
        liczby[5] = 2;
        liczby[6] = 1;
        liczby[7] = 10;
        liczby[8] = 4;
        liczby[9] = 9;
        //pobieranie wartosci
        int wartosc = liczby[4];
        System.out.println(wartosc);
        System.out.println(liczby[0]);
//ArrayIndexOutOfBoundsExeption  indeks tablicy nigdy nie ebdzie ujemny, albo wczytanie bedzie spoza zakresu tablicy

//sprawdzamie dlugosci tablicy
        int dlugoscTablicy = liczby.length;
        System.out.println("Tablica ma długość: " + dlugoscTablicy);

        String[] imiona = {"Ala", "Piotr", "Adam","Eliza"};
        System.out.println("Długosc tablicy: " + imiona.length);

        //wyswietlenie wszystkich elementow tablicy

        for(int i = 0; i < imiona.length; i++) {
            String name = imiona[i];
            //alternatywne
            //od razu wyswietla imiona bez tworzenia zmiennej
            System.out.println("Imie nr. " + (i + 1) + " to: " + imiona [i]);

        }

//dynamiczne tworzenie tablicy
        System.out.println("podaj rozmiar tablicy: ");
        Scanner scanner = new Scanner (System.in);
        int rozmiar = scanner.nextInt();
        int[] dynamicznaTablica = new int [rozmiar];
        System.out.println("Rozmiar Dynamicznej tablicy: " + dynamicznaTablica.length);

    }
}
