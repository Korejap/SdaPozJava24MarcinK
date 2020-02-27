package Zajecia6.zadanierazemfirma;

import java.util.Scanner;

public class Menu {

    //pokazuje wszystkie dostepne akcje od uzytkownika
    public void pokazGlowneMenu(){
        System.out.println("Podaj opcję:");
        System.out.println("Menu" +'\n' + 1 +" Wypisywanie listy wszystkich pracowników"+ '\n'+2 +" Dodanie nowych pracowników" + 3 +" Eksport"+ '\n' + 4+" Usuwanie pracownika" + '\n' + 5 +" Generator"+ '\n' + 6
                +"Edycja danych"+ '\n' + 7 +" Eksport danych do liku"+ '\n' + 8 + " Informacja o programie");
        System.out.println("e albo q - Zakończenie aplikacji");
    }

    // do obsługi menu
    public String pobierzAkcjeODUzytkownika(){
        Scanner sc = new Scanner(System.in);
        String line= sc.nextLine();
        return line.toLowerCase();


    }
}
