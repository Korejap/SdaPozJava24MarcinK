package zajecia4;

import java.util.Random;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int[][] tab = new int[5][5];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                tab[i][j] = rand.nextInt(11) - 5;
                System.out.print(tab[i][j] + ", ");



//                int max = tab[0][0];
//                for (i = 0; i < 5; i++) {
//                    if (tab[i][j] < max) {
//                        max = tab[i][j];
//
//                    }
//                    System.out.println("Najwieksza wartosc w kolumnie to:" + max);
//                }


            }
            System.out.println();
        }
    }
}
