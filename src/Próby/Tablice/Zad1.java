package Próby.Tablice;

import javax.swing.*;
import java.util.Random;

public class Zad1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];

        //todo DZIWNE RZECZY SIE DZIEJA
//        for (int i : tab) {
//            tab[i] = random.nextInt(20) - 10;
//            System.out.print(tab[i] + ", ");

//        }
        System.out.println();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(20) - 10;
            System.out.print(tab[i] + ", ");

        }
        int max = tab[0];
        int min = tab[0];

        for (int i = 0; i < tab.length; i++) {

            if (tab[i] > max) {
                max = tab[i];
            }


            if (tab[i] < min) {
                min = tab[i];
            }
            continue;
        }
        System.out.println();
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];
        }
        double srednia = suma / tab.length;
        System.out.println("srednia to: " + srednia);
        System.out.println("WIeksze od sredniej; ");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > srednia) {
                System.out.print(tab[i] + " ");
            }
        }
        System.out.println("mniejsze do sredniej ");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < srednia) {
                System.out.print(tab[i] + " ");
            }
        }
        System.out.println("Odwrotna kolejnosć: ");
        int odwrotnie = 0;
        int dlugosc = tab.length;

        for (int i = dlugosc - 1; i >= 0; i--) {
            odwrotnie = tab[i];
            System.out.print(odwrotnie + ", ");
        }
    }
}
