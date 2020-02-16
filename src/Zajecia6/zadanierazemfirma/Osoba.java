package Zajecia6.zadanierazemfirma;

public class Osoba {

    private String imie;
    private String nazwisko;
    private char plec;
    private int numerDzialu;
    private float placa;
    private int wiek;
    private int liczbaDzieci;
    private boolean stacCywilny;


    public boolean czyPlacaJestPowyzejPodanejwartosci(float podanaWartosc){
       return  placa > podanaWartosc;
    }

public void wypiszSpecjalnie(){
    String napis = "Pracownik{" +
            "Osoba{" +
            "imie='" + imie.toUpperCase() + '\'' +
            ", nazwisko='" + nazwisko.toUpperCase() + '\'' +
            '}';
    System.out.println(napis);
}
    public void wypiszOkrojoneDane(int index) {
        String napis = "Index: " + index + " | Pracownik{" +
                "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                '}';
        System.out.println(napis);
    }





    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec=" + plec +
                ", numerDzialu=" + numerDzialu +
                ", placa=" + placa +
                ", wiek=" + wiek +
                ", liczbaDzieci=" + liczbaDzieci +
                ", stacCywilny=" + stacCywilny +
                '}';
    }
//todo fajne do przejrzenia i nauczenia, generowanie automatyczne przez Inteliji
    public Osoba(String imie, String nazwisko, char plec, int numerDzialu, float placa, int wiek, int liczbaDzieci, boolean stacCywilny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.numerDzialu = numerDzialu;
        this.placa = placa;
        this.wiek = wiek;
        this.liczbaDzieci = liczbaDzieci;
        this.stacCywilny = stacCywilny;

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


}

