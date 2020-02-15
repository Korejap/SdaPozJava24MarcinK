package Zajecia6;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Podaj 6 wybrancy przez siebie liczb: ");

        int[] tablica = new int[6];


        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = sc.nextInt();
        }

        int[] tablicaLos = new int[6];

        for (int i = 0; i < tablicaLos.length; i++) {
            tablicaLos[i] = rd.nextInt(49) + 1;
        }
        System.out.println("Twoje podane liczby to: ");

        for (int e = 0; e < tablica.length; e++) {
            System.out.print(tablica[e] + ",");

        }

        System.out.println('\n' + "Wylosowane liczby to");

        for (int z = 0; z < tablicaLos.length; z++) {
            System.out.print(tablicaLos[z] + ",");
        }
        int trafione = 0;

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablicaLos.length; j++) {
                if (tablica[i] == tablicaLos[j]) {
                    trafione++;
                }
            }
        }

        System.out.println("Trafiono " + trafione + " z " + tablica.length);
    }
}
