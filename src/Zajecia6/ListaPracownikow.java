package Zajecia6;



public class ListaPracownikow {

    private Osoba[] listaPracownikow = new Osoba[100];

    public void listaWydruk() {
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] != null) {
                System.out.println(listaPracownikow[i]);
            }

        }


//   public void addNewPracownik();

        Osoba p1 = new Osoba();
        Osoba p2 = new Osoba();
        listaPracownikow[0] = p1;

        p1.setImie("Andrzej");
        p1.setNazwisko("Kowalczyk");
        p1.setLiczbaDzieci(2);

        listaPracownikow[1] = p2;

        p2.setImie("Iwona");
        p2.setNazwisko("Szymbi");



        // tutaj wstawic metody najlepiej bo lista pracownikow juz tu jest

    }
//todo Jak dodac nowa osobe?
    public void addNewPracownik() {
        for (int i = 0; i < listaPracownikow.length; i++) {
            if (listaPracownikow[i] == null) {
                String nazwaZmiennej = "p" + i;
//                Osoba nazwaZmiennej = new Osoba();

            }

        }
    }
}