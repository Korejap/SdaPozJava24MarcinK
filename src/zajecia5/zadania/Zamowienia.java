package zajecia5.zadania;

import jdk.jfr.Experimental;

import java.sql.SQLOutput;

public class Zamowienia {
    private final static int DOMYSLNY_ROZMIAR_ZAMOWIENIA = 10;
    private Pozycja[] pozycje;
    private int ileDodanych;
    private int maxRozmiar;

    //wywolujemy konstruktor parametr przekazujacy domyslny rozmiar zamowienia
    public Zamowienia() {
        this(DOMYSLNY_ROZMIAR_ZAMOWIENIA);
    }

    public Zamowienia(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
        pozycje = new Pozycja[maxRozmiar];
    }

    public void dodajPozycje(Pozycja poz) {
        if (this.ileDodanych >= maxRozmiar) {
            System.out.println("Nie dodam, osiagnieto max rozmiar");
        } else {
            this.pozycje[ileDodanych] = poz;
            ileDodanych++;
            // można też skrocic this.pozycje[ileDodanych++] = p;
        }
    }

    public double obliczWartosc() {
        //throw new RuntimeException("Do zaimplementowania"); // gdy mamy szkielet a pozniej sie tym zajmiemy ale zeby blad nam nie wywalal
        double wartoscZamowienia = 0;
        for (Pozycja p : pozycje) {
            if (p != null) {
                wartoscZamowienia += p.obliczWartosc();

                //todo Nie za bardzo kapuje czemu wartoscZamowienia += p.obliczWartosc();
            }
        }
        return wartoscZamowienia;
    }

    public String toString() {
        String result = "zamówienie: \n";
        for (int i = 0; i < ileDodanych; i++) {
            result += pozycje[i].toString() + "\n";
        }
        return result;
    }

    public static void main(String[] args) {

        int pozycje[] = new int[20];
        Pozycja p1 = new Pozycja("Pierogi", 1, 3.5);
        System.out.println(p1);
        Pozycja p2 = new Pozycja("Bakłażan", 3, 4);
        System.out.println(p2);
        Zamowienia z = new Zamowienia(20);
        z.dodajPozycje(p1);
        z.dodajPozycje(p2);
        System.out.println(z);


    }
}
