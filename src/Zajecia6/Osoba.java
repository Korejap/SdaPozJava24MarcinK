package Zajecia6;

public class Osoba {

    private String imie;
    private String nazwisko;
    private char plec;
    private int numerDzialu;
    private float placa;
    private int wiek;
    private int liczbaDzieci;
    private boolean stacCywilny;




    public void infoPelne() {
       imie = this.imie.toUpperCase();
        char c = this.imie.charAt(0);
        imie = this.imie.substring(1);
        imie = c + imie;
        imie = imie.toLowerCase();

        nazwisko = this.nazwisko.toUpperCase();
         c = this.nazwisko.charAt(0);
        nazwisko = this.nazwisko.substring(1);
        nazwisko = c + nazwisko;
        nazwisko = nazwisko.toLowerCase();

        System.out.println("Imię: " + this.imie + '\n' + "Nazwisko: " + '\n' + this.nazwisko + '\n'
                + "Płec: " + this.plec + '\n' + "Numer działu: " + this.numerDzialu + '\n' + "Placa" + this.placa + '\n'
                + "Wiek: " + this.wiek + '\n' + "Liczba dzieci:" + this.liczbaDzieci + '\n' + "Stan cywilny: " + this.stacCywilny);
    }


    public void imieNazwiskoPlaca() {

        imie = this.imie.toUpperCase();
        char c = this.imie.charAt(0);
        imie = this.imie.substring(1);
        imie = c + imie;
        imie = imie.toLowerCase();

        nazwisko = this.nazwisko.toUpperCase();
        c = this.nazwisko.charAt(0);
        nazwisko = this.nazwisko.substring(1);
        nazwisko = c + nazwisko;
        nazwisko = nazwisko.toLowerCase();

        System.out.println("Imię: " + this.imie + '\n' + "Nazwisko: " + '\n'
                + this.nazwisko + '\n' + "Placa" + this.placa);
    }

    public void imieNazwiskoKapital() {
        this.imie.toUpperCase();
        this.nazwisko.toUpperCase();
        System.out.println(this.imie + " " + this.nazwisko);
    }

    public boolean pensjaSredniasprawdz(float placa, int n) {
        boolean placaOk;
        if (this.placa > n) {
            return placaOk = true;
        }
        return placaOk = true;
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public int getNumerDzialu() {
        return numerDzialu;
    }

    public void setNumerDzialu(int numerDzialu) {
        this.numerDzialu = numerDzialu;
    }

    public float getPlaca() {
        return placa;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getLiczbaDzieci() {
        return liczbaDzieci;
    }

    public void setLiczbaDzieci(int liczbaDzieci) {
        this.liczbaDzieci = liczbaDzieci;
    }

    public boolean isStacCywilny() {
        return stacCywilny;
    }

    public void setStacCywilny(boolean stacCywilny) {
        this.stacCywilny = stacCywilny;
    }

    public double procentPodwyzki(double procent) {
        double podwyzka = this.placa * procent;
        if (liczbaDzieci >= 1) {
            podwyzka += this.placa * 0.02;
        }

        while (stacCywilny = true) {
            podwyzka += this.placa * 0.03;
        }

        return podwyzka;





    }
}
