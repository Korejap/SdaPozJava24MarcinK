package Zajecia6;

import java.util.Random;
import java.util.Scanner;

public class SzyfrolamaczBezMetod {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tablica[] = new int[4];
        int zycie = 6;
        Random random = new Random();
        String posredniaLiczba = "";
        int tablicaLiczba = 0;

//petla gry

        while (zycie > 0) {
// ustawSzyfr;
            if (zycie == 6) {
                posredniaLiczba = "";
                tablicaLiczba = 0;
                for (int i = 0; i < tablica.length; i++) {
                    tablica[i] = random.nextInt(10);
                }
            for (int i = 0; i < tablica.length; i++) {

                posredniaLiczba += tablica[i];
            }
            tablicaLiczba = Integer.valueOf(posredniaLiczba);
        }


//sprawdzanie
            if (zycie > 0) {
                System.out.println("Podaj czterocyfrowy szyfr");
                int odpowiedz = scanner.nextInt();
                    if (tablicaLiczba > odpowiedz) {
                        zycie--;
                        System.out.println("Podana liczba jest mniejsza od szyfru.");
                        System.out.println("Tracisz jedno życie.. Pozostało:" + zycie);
                    } else if (tablicaLiczba < odpowiedz) {
                        zycie--;
                        System.out.println("Podana liczba jest większa od szyfru.");
                        System.out.println("Tracisz jedno życie. Pozostało:" + zycie);
                    } else if (tablicaLiczba == odpowiedz) {
                        System.out.println("Gratulacje! Podałeś prawidłową odpowiedź!");
                        System.out.println("Czy chcesz grać dalej? Y - tak | N - nie");
                        String coDalej = scanner.nextLine().toUpperCase();
                        switch (coDalej) {
                            case "Y":
                                zycie = 6;

                            case "N":
                                System.exit(0);
                                break;

                        }
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
                        zycie = 6;

                    case "N":
                        System.exit(0);
                        break;

                }
            }
        }

    }

}



