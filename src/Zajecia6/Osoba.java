package Zajecia6;

public class Osoba {

   private String imie;
    private String nazwisko;
    private char plec;
    private int numerDzialu;
    private float placa;
    private int wiek;
    private int liczbaDzieci;
    private  boolean stacCywilny;

    public void infoPelne() {
//        this.imie.toLowerCase();
//        this.imie.charAt(0) =
//        this.nazwisko.toLowerCase();

        System.out.println("Imię: " + this.imie + '\n' + "Nazwisko: " + '\n' + this.nazwisko + '\n'
                + "Płec: " + this.plec + '\n' + "Numer działu: " + this.numerDzialu + '\n' + "Placa" + this.placa + '\n'
                + "Wiek: " + this.wiek + '\n' + "Liczba dzieci:" + this.liczbaDzieci + '\n' + "Stan cywilny: " + this.stacCywilny);
    }


        public void imieNazwiskoPlaca(){
            System.out.println("Imię: " + this.imie + '\n'+ "Nazwisko: " + '\n'+ this.nazwisko + '\n' + "Placa" + this.placa);
        }

    public void imieNazwiskoKapital(){
        this.imie.toUpperCase();
        this.nazwisko.toUpperCase();
        System.out.println(this.imie + " " + this.nazwisko);
    }

    public boolean pensjaSredniasprawdz(float placa, int n){
        boolean placaOk;
        if(this.placa > n){
            return  placaOk = true;
        }
        return placaOk = true;
    }
public double procentPodwyzki (double procent){
double podwyzka = this.placa * procent;
        if(liczbaDzieci >= 1){
            podwyzka += this.placa * 0.02;
        }
while(stacCywilny = true){
    podwyzka += this.placa * 0.03;
}

            return podwyzka;
}
}
