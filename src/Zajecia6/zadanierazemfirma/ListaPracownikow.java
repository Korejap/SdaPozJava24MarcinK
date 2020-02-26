package Zajecia6.zadanierazemfirma;

import java.util.Scanner;

public class ListaPracownikow {

    private Osoba[] listaPracownikow = new Osoba[100];


    private int licznikPracownikow = 0;  //todo fajne, do przejrzenia i zapamietania

    public ListaPracownikow() {
        Osoba p1 = new Osoba("Filip", "Ecjo", 'M', 2, 20, 20, 2, true);
        listaPracownikow[licznikPracownikow++] = p1;

        Osoba p2 = new Osoba("Iwona", "Eco", 'K', 1, 300, 30, 0, false);
        listaPracownikow[licznikPracownikow++] = p2;
        Osoba p3 = new Osoba("ona", "Eo", 'K', 1, 300, 30, 0, false);
        listaPracownikow[licznikPracownikow++] = p3;
    }

    public void dodajNowegoPracownika() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Imię: ");
        String imie = sc.nextLine();
        System.out.println("Nazwisko: ");
        String nazwisko = sc.nextLine();
        System.out.println("Płeć: ");
        char plec = sc.nextLine().charAt(0); // uwaga! nextLine zeby nie bylo problemow dlatego zmiany np char at albo pozniej Integer.parseInt ...
        System.out.println("Numer działu: ");
        int numerDzialu = Integer.parseInt(sc.nextLine());
        System.out.println("Płaca: ");
        float placa = Float.parseFloat(sc.nextLine());
        System.out.println("Wiek: ");
        int wiek = Integer.parseInt(sc.nextLine());
        System.out.println("Liczba dzieci: ");
        int liczbaDzieci = Integer.parseInt(sc.nextLine());
        System.out.println("Stan cywilny: ");
        boolean stanCywilny = Boolean.parseBoolean(sc.nextLine());


        Osoba nowyPracownik = new Osoba(imie, nazwisko, plec, numerDzialu, placa, wiek, liczbaDzieci, stanCywilny);
        listaPracownikow[licznikPracownikow++] = nowyPracownik;

    }

    public void wypiszWszystkichPracownikow() {
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                listaPracownikow[i].wypiszOkrojoneDane(i);
            }

        }
    }

    private int pobierzIndexPracownika() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj indeks uczestnika");
        int index = Integer.parseInt(sc.nextLine());
        return index;
    }

    public void usuwaniePracownikaZListy() {
        int ileMamyPracownikow = ileMamyPracowników();
        if (ileMamyPracowników() > 0) {
            int index = pobierzIndexPracownika();
            listaPracownikow[index] = null;
            System.out.println("Usunięto");
            for (int i = 0; i <listaPracownikow.length ; i++) {
                if(listaPracownikow[i] == null){
                    if(i != 99){
                        listaPracownikow[i] = listaPracownikow[i+1];
                        listaPracownikow[i+1] = null;
                    }


                }

            }

        }else{
        System.out.println("Masz pusta liste");}
    }




    private int ileMamyPracowników() {
        int suma = 0;
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                suma++;
            }

        }
        return suma;
    }


//      if(licznikPracownikow <0) {
//          System.out.println("Nie mozna usunąć");}else {
//          for (int i = 0; i < listaPracownikow.length; i++) {
//              if (listaPracownikow[i] != null) {
//                  System.out.print(i + 1 + ". ");
//                  listaPracownikow[i].wypiszOkrojoneDane();
//              }
//          Scanner sc = new Scanner(System.in);
//          System.out.println("Podaj pozycję z której chcesz usunąc pracownika: ");
//          int usuwanaPozycja = sc.nextInt();
//          listaPracownikow[usuwanaPozycja - 1] = null;
//                  licznikPracownikow--;
//          }




    }

