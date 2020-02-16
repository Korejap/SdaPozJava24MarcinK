package Zajecia6;

import java.util.Scanner;

public class Menu {
public void printMenu(String akcja){
    Scanner sc = new Scanner(System.in);
    Osoba osoba = new Osoba();
ListaPracownikow lista = new ListaPracownikow();

int opcja = sc.nextInt();

//        System.out.println("Podaj opcję:");
//        System.out.println("Menu" +'\n' + 1 +"Wypisywanie listy wszystkich pracowników"+ '\n'+2 +"Dodanie nowych pracowników" + 3 +"Eksport"+ '\n' + 4+"Usuwanie pracownika" + '\n' + 5 +"Edycja danych"+ '\n' + 6
//                +"Dodatkowe funckje"+ '\n' + 7 +"Eksport danych do liku"+ '\n' + 8 + "informacja o programie");

switch(opcja) { // gto gdzie indziej
    case 1:

lista.listaWydruk();

        break;
   case 2:

        break;
   case 3:

        break;
   case 4:

        break;
   case 5:

        break;
   case 6:

        break;
   case 7:

        break;
   case 8:

        break;



    default:
        break;
}
}

    }

