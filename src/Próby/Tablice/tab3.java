package Próby.Tablice;

import java.sql.SQLOutput;
import java.util.Random;

public class tab3 {

    static void macierz(int s[][]) {
        Random rad = new Random();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s[i][j] = rad.nextInt(11) - 5;
            }
        }
        System.out.println("Liczby w macierzy: ");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                System.out.print(s[i][j] + ", ");
            }
            System.out.println();
        }
    }

    static void min(int s[][]) {
        int min = 0;
        System.out.println("Min w kolumnach:");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                if (s[i][j] < min) {
                    min = s[i][j];
                    continue;
                }
            }
            System.out.println(i + 1 + " - " + min);
            min = 0;
        }
    }

    static void max(int s[][]) {
        //max, min
        System.out.println("Max w kolumnach:");
        int max = 0;


        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                if (s[i][j] > max) {
                    max = s[i][j];
                    continue;
                }
            }
            System.out.println(i + 1 + " - " + max);
            max = 0;
        }

    }

    public static void main(String[] args) {


        int matrix[][] = new int[5][5];

        macierz(matrix);
        min(matrix);
        max(matrix);


    }

}
