package zajecia3.arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = scanner.nextInt();
        //tworzymy nowa tablice:
        int[] array = new int[size];

        //wypelnij w petli fot tablice
        //np. "podaj 1 elenet na tablicy:
        //np. "podaj 2 elenet na tablicy:


        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + (i + 1) + " element tablicy");
            array[i] = scanner.nextInt();
            // lub int liczba = scaner    aray[i] = liczba


        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element tablicy nr. " + (i + 1) + " to: " + array[i]);
        }
//oblicz min, max, avg, itd

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < max) {

//aktualny max wikszy od i - tego elementu, wiec nic nie robiimy
                //kontunujemy petle i zaczynamy obieg petli poprez komende continue;
                continue;
// brak; wychodzimy z petli
            }
            //podmiana max
            max = array[i];

        }
        System.out.println("Max to:" + max);
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
        }
        System.out.println("Minimum to:" + min);
        double suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];

        }
//double suma = srednia/array.length;
//        System.out.println(suma);
        System.out.println("srednia to: " + suma / array.length);
        double srednia = suma / array.length;


        System.out.println("Liczby mniejsze od średniej to: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < srednia) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("Liczby większe od średniej to: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > srednia) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("Podane liczby: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\n A w odwrotnej kolejności to:");
        int dlugosc = array.length;
        for (int i = dlugosc -1; i >= 0; i--) {
            System.out.print(array[i] + ", ");


        }

    }
}
