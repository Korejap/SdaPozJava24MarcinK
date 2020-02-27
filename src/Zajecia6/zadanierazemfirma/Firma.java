package Zajecia6.zadanierazemfirma;

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
                default:
                    System.out.println("Błedna akcja");

            }

        }


    }
}
