package Zajecia7;

import java.util.Scanner;

public class TablicaGwiazdki {







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userAnswer = sc.nextLine();

        String[] table = userAnswer.split(" ");

int[] tableInt = new int[table.length];
        for (int i = 0; i <tableInt.length ; i++) {
            tableInt[i] = Integer.parseInt(table[i]);
        }

        for (int i = 0; i <table.length ; i++) {
            System.out.print(i + ": ");

            for (int j = 0; j < tableInt[i] ; j++) {

                    System.out.print("* ");


            }
            System.out.println("(" + table[i] + ")");


        }

    }
}
