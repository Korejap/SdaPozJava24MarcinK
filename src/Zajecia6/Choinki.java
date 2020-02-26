package Zajecia6;

import java.util.Scanner;

public class Choinki {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj jaką wielkośc powinna mieć choinka: ");
        int wielkosc = sc.nextInt();

        String choinka[][] = new String[wielkosc][wielkosc];


        for (int i = 0; i < choinka.length ; i++) {
            for (int j = 0; j < choinka.length; j++) {
                choinka[i][j] = "*";

            }
        }
int licznik = 0;
        for (int i = 0; i < choinka.length ; i++) {
            for (int j = 0; j < choinka.length; j++) {
                if(licznik <= j){
                    System.out.print(choinka[i][j]);}


            }
            licznik++;
            System.out.println();
        }

         licznik = 0;
        for (int i = 0; i < choinka.length ; i++) {
            for (int j = 0; j < choinka.length; j++) {
                if(licznik >= j){
                    System.out.print(choinka[i][j]);}


            }
            licznik++;
            System.out.println();
        }

        System.out.println();



        licznik = 0;
        for (int i = 0; i < choinka.length; i++) {
            for (int j = 0; j < choinka.length; j++) {
                licznik++;


            }

            System.out.println("");
        }

        // nauczyciela rozwiazanie


        for (int i = 0; i <wielkosc ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("# ");
            }
            System.out.println("");
        }
        System.out.println();

        for (int i = 0; i < wielkosc; i++) {
            for (int j = 0; j < wielkosc-i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        // choinka odwrocona
        for (int i = 0; i < wielkosc ; i++) {
            for (int j = 0; j < wielkosc; j++) {
              if(j >= i) {
                  System.out.print("# ");
              }else{
                      System.out.print(" ");
                  }


            }
            System.out.println();
        }

        for (int i = 0; i < wielkosc ; i++) {
            for (int j = 0; j < wielkosc; j++) {
                if(j >= i) {
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
// choinka 4   niedokonczone
        for (int i = 0; i < wielkosc ; i++) {
            for (int j = 0; j < wielkosc; j++) {
                if(j >= wielkosc - i) {
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
        System.out.println();

        //choinka piramidka
        for (int i = 0; i < wielkosc ; i++) {
            int zakres = (((wielkosc*2) / 2) -1) ;
            for (int j = 0; j < wielkosc*2 -1; j++) {
//                if(wielkosc %2 ==1){
                if (j >= zakres - i && zakres + i >= j) {
                    System.out.print("#" );
                }else {
                    System.out.print(" ");

                    }


            }

                System.out.println();

        }


        }

}
