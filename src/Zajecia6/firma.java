package Zajecia6;

import java.util.Scanner;

public class firma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        String akcja = "";

        System.out.println("Podaj opcję:");
        System.out.println("Menu" +'\n' + 1 +" Wypisywanie listy wszystkich pracowników"+ '\n'+2 +" Dodanie nowych pracowników" + 3 +" Eksport"+ '\n' + 4+" Usuwanie pracownika" + '\n' + 5 +" Edycja danych"+ '\n' + 6
                +" Dodatkowe funckje"+ '\n' + 7 +" Eksport danych do liku"+ '\n' + 8 + " Informacja o programie");

        menu.printMenu(akcja);

        ;
            ListaPracownikow listaPracownikow = new ListaPracownikow();
//            listaPracownikow.addNewPracownik();



    }
}
