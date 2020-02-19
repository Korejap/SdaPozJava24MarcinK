package Zajecia6;

import java.util.Scanner;
public class Wisielec2{





    public static void main(String[] args) {
        int zycie = 5;
        System.out.println("Podaj wyraz dla przeciwnika");
        Scanner sc = new Scanner(System.in);
        String wyraz = sc.nextLine().toUpperCase();
        System.out.println("Kolej przeciwnika" );
        System.out.println("Podaj literę");
String litera = sc.nextLine();
char odpowiedz = litera.toUpperCase().charAt(0);
        char tablica[] = new char[wyraz.length()];
        char tablica2[] = new char[tablica.length];
// warunek zycie + pętla podawanie kolejnych opcji
        if(zycie > 0){
            while ( zycie > 0) {

            }

        }else System.out.println("Game Over");



        //wprowadzenie do tablicy1
        for (int i = 0; i < wyraz.length(); i++) {
            tablica[i] = wyraz.charAt(i);
        }



        //sprawdzanie
        int  poprawnaOdp = 0;
        for (int i = 0; i <tablica.length ; i++) {
            if(odpowiedz == tablica[i]){
                tablica2[i] = tablica[i];
                poprawnaOdp++;
            }
            }
            if(poprawnaOdp < 1){
                System.out.println("Błąd! tracisz 1 życie");
                zycie--;
                System.out.println("Pozostała liczba żyć: " + zycie);


        }





    }

}
