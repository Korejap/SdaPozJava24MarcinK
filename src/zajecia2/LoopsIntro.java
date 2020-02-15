package zajecia2;

import java.util.Scanner;

public class LoopsIntro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // petla moze wykonac sie 0 razy lub w nieskonczonosc


        int wiek = 20;
        System.out.println(wiek);
        // Zwiekszenie wartosci zmiennej 1
        wiek= wiek +7;
        // zwiekszenie wartosci zmiennej 2
        wiek += 7;
        // zwiekszenie wartosci zmiennej 3 (o jeden)
        wiek++;  // to ssamo co wiek += 1
// post vers pre inkrementacja
        int liczba = 0;
        System.out.println(liczba++);
        System.out.println(liczba);

        int number = 0;
        System.out.println(++number);
        System.out.println(number);


        //prosta pętla wartosci 0-9
        System.out.println("Petla while...");
        int licznik = 0;
        while(licznik < 10){
            System.out.println(licznik++); //zmienna ++ szczegolnie w petlach

        }

        int x = 20;
        // petla DO wykona sie chociaz raz
        do {
            System.out.print(x++   + ", ");
        }while(x<10);


    }
}
