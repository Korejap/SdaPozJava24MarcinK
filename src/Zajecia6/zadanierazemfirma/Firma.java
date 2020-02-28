package Zajecia6.zadanierazemfirma;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Firma {
    public static void main(String[] args) {
        Menu menu = new Menu();
ListaPracownikow listaPracownikow = new ListaPracownikow();

        String akcja = "";
        while (!akcja.equals("e") && !akcja.equals("q")) {
            menu.pokazGlowneMenu();
            akcja = menu.pobierzAkcjeODUzytkownika();


            switch(akcja) {
                case "1":
listaPracownikow.wypiszWszystkichPracownikow();
                    break;
                case "2":
listaPracownikow.dodajNowegoPracownika();
                    break;
                case "3":
                    break;
                case "4":
                    listaPracownikow.wypiszWszystkichPracownikow();
                    listaPracownikow.usuwaniePracownikaZListy();
                    break;
                case "5":
                    listaPracownikow.generatorPracownikow();
                case "e":
                case "q":
                    System.out.println("Koniec programu");
                    break;
                case "6":
                    listaPracownikow.wypiszWszystkichPracownikowFull();
                    listaPracownikow.edycjaDanych();
                case "7":
                    System.out.println("Nowe menu. 1 - Ile pracowników pensja. |  2 - średnia z działu. | Podaj numer:");
                    Scanner scanner = new Scanner(System.in);
                    int wybor = scanner.nextInt();
                    switch (wybor){
                        case 1:
                            listaPracownikow.obliczLPracownikowZPensja();
                        case 2:
                            listaPracownikow.sredniaPlacyZDzialu();
                    }

                default:
                    System.out.println("Błedna akcja");

            }

        }


    }
}
