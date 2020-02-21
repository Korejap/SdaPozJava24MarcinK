package Zajecia6;

import java.util.Random;
import java.util.Scanner;

public class Szyfrolamacz {

   static int zycie = 5;
    Random random = new Random();
  int tablica[] = new int[4];
  String posredniaLiczba;
  static int tablicaLiczba;


    public int  ustawSzyfr(int tablica[]){
        for (int i = 0; i <tablica.length ; i++) {
            tablica[i] = random.nextInt(10);

            }
        for (int i = 0; i <tablica.length ; i++) {

            posredniaLiczba += tablica[i];
        }
        return tablicaLiczba = Integer.parseInt(posredniaLiczba);
    }




//public void sprawdzHaslo( int tablicaLiczba, int odpowiedz ){
//
//
//
//        if(this.tablicaLiczba > odpowiedz){
//            System.out.println("Podana liczba jest mniejsza od szyfru.");
//            System.out.println("Tracisz jedno życie.");
//            zycie--;
//        }else if(this.tablicaLiczba < odpowiedz){
//            System.out.println("Podana liczba jest większa od szyfru.");
//            System.out.println("Tracisz jedno życie.");
//            zycie--;
//        }else if(this.tablicaLiczba == odpowiedz){
//            System.out.println("Gratulacje! Podałeś prawidłową odpowiedź!");
//
//        }
//    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Szyfrolamacz tablica = new Szyfrolamacz();
        int tablica2[] = new int[4];

        //petla gry

        while(zycie>0){
tablica.ustawSzyfr(tablica2);
            System.out.println("Podaj 4 swoje cyfry");
            int odpowiedz = scanner.nextInt();
//tablica.sprawdzHaslo(tablicaLiczba, odpowiedz);

            if (zycie > 0) {

                    if (tablicaLiczba > odpowiedz) {
                        System.out.println("Podana liczba jest mniejsza od szyfru.");
                        System.out.println("Tracisz jedno życie.");
                        zycie--;
                    } else if (tablicaLiczba < odpowiedz) {
                        System.out.println("Podana liczba jest większa od szyfru.");
                        System.out.println("Tracisz jedno życie.");
                        zycie--;
                    } else if (tablicaLiczba == odpowiedz) {
                        System.out.println("Gratulacje! Podałeś prawidłową odpowiedź!");

                    }


            } else {
                System.out.println("Game over");
                System.out.println();
                System.out.println("Szyfrem była kombinacja: " + tablica.toString());
                System.out.println();
                System.out.println("Czy chcesz grać dalej? Y - tak | N - nie");
                String coDalej = scanner.nextLine().toUpperCase();
                switch (coDalej) {
                    case "Y":
                        zycie = 5;
                    case "N":
                        System.exit(0);
                        break;

                }
            }




        }

    }

}
