package Zajecia6;

import java.util.Scanner;

public class Wisielec {
char  tablica[];
String tablica2[];
    public char[] doTablicy(String wyraz) {
       char tablica[] = new char[wyraz.length()];
       wyraz.toUpperCase();
        for (int i = 0; i < wyraz.length(); i++) {
            tablica[i] = wyraz.charAt(i);
        }
        return tablica;
    }
    public char[] sprawdzHaslo(char odpowiedz, char tablica[]){
        char tablica2[] = new char[tablica.length];
        for (int i = 0; i <tablica.length ; i++) {
            if(odpowiedz == tablica[i]){
tablica2[i] = tablica[i];
            }
        }
return tablica2;
    }


    public static void main(String[] args) {
        int zycie = 5;
        System.out.println("Podaj wyraz dla przeciwnika");
        Scanner sc = new Scanner(System.in);
        String wyraz = sc.nextLine();
        System.out.println("Kolej przeciwnika" );
        System.out.println("Podaj literę");
String litera = sc.nextLine();
char odpowiedz = litera.toUpperCase().charAt(0);




    }

}
