package Zajecia6;

import java.util.Scanner;

public class firma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu menu = new Menu();
        String linia = "";
        while (linia != "e") {

            menu.printMenu();
            linia = sc.nextLine();
            System.out.println(linia);
        }
        ListaPracownikow listaPracownikow = new ListaPracownikow();
        listaPracownikow.addNewPracownik();



    }
}
