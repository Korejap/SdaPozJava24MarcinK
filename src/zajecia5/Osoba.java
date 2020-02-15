package zajecia5;

public class Osoba {

    //pola w klasie

    public String imie;
    public String nazwisko;
    public int wiek;
    public double wzrost;
    public double waga;
// konstruktor bezparametrowy

    public Osoba(){
        System.out.println("Tworzę obiekt typu Osoba...");
    }
public Osoba(String imie, String nazwisko, int w){
        this.imie = imie;
        this.nazwisko = nazwisko;
        //trzeci parametr nazywa sie inaczej niz pole, wiec mozna tak jak ponizej
        wiek = w;
}
// definicja metody do opisu Osoby
    public String przedstawSie(){
        return "Na imię mam: " + this.imie + ", nazywam sie " + this.nazwisko + " i mam " + "lat " + this.wiek;

    }


}
