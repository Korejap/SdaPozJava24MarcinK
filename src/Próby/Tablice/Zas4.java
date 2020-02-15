package Próby.Tablice;


import java.util.Scanner;

public class Zas4 {
    public static void main (String[] args){


        Scanner scanner = new Scanner (System.in);

        System.out.println("Podaj liczbę: ");
        int n = scanner.nextInt() + 1 ;

 boolean[][] a = new boolean[n][n];


        for (int i = 1; i < n ; i++) {
            for (int j = 1; j < n ; j++) {
if (i >= j && i % j != 1){
                        a[i][j] = true;

                } else if(i <= j && j % i != 1){
    a[i][j] = true;
                }
            }

        }

        for (int i = 1; i <= 1; i++) {
                a[i][1] = true;
                a[1][i] = true;





        }
int numerek = 1;

        System.out.print("   ");
        for (int i = 1; i < n ; i++) {
            System.out.print("|" + i + "|");

        }
        System.out.println();
        for (int i = 2; i < n ; i++) {

            for (int j = 1; j < n ; j++) {
                if (numerek == (i - 1)) {
                    System.out.print("|" + numerek + "|");
                    numerek++;
                }
               if (a[i][j] == true) {
                    System.out.print(" + ");
                } else{
                    System.out.print(" - ");

            }
            }
            System.out.println();
        }






    }
}
