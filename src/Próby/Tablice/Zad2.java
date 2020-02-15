package Próby.Tablice;

import java.util.Random;

public class Zad2 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.print("Wylosowane liczby partia I: " );
        int[] tab1 = new int[20];
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = random.nextInt(10) + 1;
            System.out.print(tab1[i] + ", ");

        }
        // TODO: 19 sty 2020 Pocwiczyc
        System.out.println();
                System.out.println("Wystepowanie liczb:");
                int[] tab2 = new int[11];
                for(int i = 0; i < tab1.length; i++){
                    int index = tab1[i]; //todo
                    tab2[index] ++;



                }
        for (int i = 1; i < tab2.length; i++) {
            System.out.println(i + " - " + tab2[i]);
        }



    }
}
