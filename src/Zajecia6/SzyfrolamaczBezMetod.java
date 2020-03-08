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

int podpowiedz = 0;

int liczbaPodpowiedzi = 0;
int losowaDoPodpowiedzi = 0;

//petla gry

        while (zycie > -1) {
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
                zycie--;
                losowaDoPodpowiedzi = 0;
                liczbaPodpowiedzi = 0;
            }


//sprawdzanie
            if (zycie > 0) {
                System.out.println("Podaj czterocyfrowy szyfr");
                int odpowiedz = scanner.nextInt();
                if (tablicaLiczba > odpowiedz) {
                    zycie--;
                    System.out.println("Podana liczba jest mniejsza od szyfru.");
                    System.out.println("Tracisz jedno życie.. Pozostało:" + zycie);

                    //podpowiedz
                    System.out.println("Czy chcesz podpowiedź?");
                    podpowiedz = scanner.nextInt();


                    if(podpowiedz == 1) {
                        liczbaPodpowiedzi--;
                        losowaDoPodpowiedzi = random.nextInt(4);
                        System.out.println("Cyfrą " + (losowaDoPodpowiedzi + 1) + "od lewej strony jest: " + tablica[losowaDoPodpowiedzi]);
                    }

                } else if (tablicaLiczba < odpowiedz) {
                    zycie--;
                    System.out.println("Podana liczba jest większa od szyfru.");
                    System.out.println("Tracisz jedno życie. Pozostało:" + zycie);

                    //podpowiedz
                    System.out.println("Czy chcesz podpowiedź? Wcisnij 1 jesli tak.");
                    podpowiedz = scanner.nextInt();
                    switch (podpowiedz){
                        case 1:
                        liczbaPodpowiedzi--;
                        losowaDoPodpowiedzi = random.nextInt(4);
                        System.out.println("Cyfrą " + (losowaDoPodpowiedzi + 1) + " od lewej strony jest: " + tablica[losowaDoPodpowiedzi]);
                        break;
                        default:
                            break;
                    }

                } else if (tablicaLiczba == odpowiedz) {
                    System.out.println("Gratulacje! Podałeś prawidłową odpowiedź!");
                    System.out.println("Czy chcesz grać dalej? Y - tak | N - nie");
                    String coDalej = scanner.nextLine().toUpperCase();
                    switch (coDalej) {
                        case "Y":
                            zycie = 6;
                            break;
                        case "N":
                            System.exit(0);
                            break;

                    }
                }


            } else {
                System.out.println("Game over");
                System.out.println();
                System.out.println("Szyfrem była kombinacja: " + tablicaLiczba);
                System.out.println();
                System.out.println("Czy chcesz grać dalej? Y - tak | N - nie");
                String coDalej = scanner.nextLine().toUpperCase();
                switch (coDalej) {
                    case "Y":
                        zycie = 6;
                        break;
                    case "N":
                        System.exit(0);
                        break;

                }
            }
        }

    }

}



