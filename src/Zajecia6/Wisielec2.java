package Zajecia6;

import java.util.Arrays;
import java.util.Scanner;

public class Wisielec2 {


    public static void main(String[] args) {
        int zycie = 5;
        System.out.println("Podaj wyraz dla przeciwnika");
        Scanner sc = new Scanner(System.in);
        String wyraz = sc.nextLine().toUpperCase();
        System.out.println("Kolej przeciwnika");
        System.out.println("Podaj literę");
        String litera = sc.nextLine();
        char odpowiedz = litera.toUpperCase().charAt(0);
        char tablica[] = new char[wyraz.length()];
        char tablica2[] = new char[tablica.length];
int wygrana = 0;


// karta odpowiedzi
        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i] = '_';
        }

        //wprowadzenie do tablicy1
        for (int i = 0; i < wyraz.length(); i++) {
            tablica[i] = wyraz.charAt(i);
        }


        // warunek zycie +pętla podawanie kolejnych opcji

//petla do zycia

        while (zycie >= 0) {




            //sprawdzanie
            int poprawnaOdp = 0;
            for (int i = 0; i < tablica.length; i++) {
                if (odpowiedz == tablica[i]) {
                    tablica2[i] = odpowiedz;
                    poprawnaOdp++;


                }
            }
            if (poprawnaOdp < 1) {
                System.out.println("Błąd! tracisz 1 życie");
                zycie--;
                System.out.println("Pozostała liczba żyć: " + zycie);
            } else {
                System.out.println("Trafiłeś" + '\n');
                for (int i = 0; i < tablica2.length; i++) {
                    System.out.print(tablica2[i]);
                }
            }

            if (zycie <= 0) {
                System.out.println("Game Over");
                System.out.println("Czy chcesz zagrać ponownie?");
                System.out.println("Y - tak | N - nie");
                String checKontynuacji = sc.nextLine();
                char nowaGra = checKontynuacji.toUpperCase().charAt(0);
                switch (nowaGra) {
                    case 'Y':
                        zycie = 5;
                        System.out.println("Podaj wyraz dla przeciwnika");

                  wyraz = sc.nextLine().toUpperCase();
                        System.out.println("Kolej przeciwnika");


                     // karta odpowiedzi
                        for (int i = 0; i < tablica2.length; i++) {
                            tablica2[i] = '_';
                        }

                        //wprowadzenie do tablicy1
                        for (int i = 0; i < wyraz.length(); i++) {
                            tablica[i] = wyraz.charAt(i);
                        }
                        break;
                    case 'N':
                        break;
                }
            }
            if (wygrana > 0) {

                System.out.println("Podaj literę: ");
            }
                litera = sc.nextLine();
                odpowiedz = litera.toUpperCase().charAt(0);


        }

    }

}
