package zajecia5.zadania;

public class Pozycja {

    private String nazwaTowaru;
    private int liczbaSztuk;
    private double cena;


    public Pozycja(String nazwaTowaru, int liczbaSztuk, double cena){
            this.nazwaTowaru = nazwaTowaru;
            this.liczbaSztuk = liczbaSztuk;
            this.cena = cena;
    }

    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    public void setNazwaTowaru(String nazwaTowaru) {
        this.nazwaTowaru = nazwaTowaru;
    }

    public int getLiczbaSztuk() {
        return liczbaSztuk;
    }

    public void setLiczbaSztuk(int liczbaSztuk) {
        this.liczbaSztuk = liczbaSztuk;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }



    public double obliczWartosc() {
     return cena * liczbaSztuk;
    }


    public String toString(){
      if(nazwaTowaru.length()<20){
          int spacja = 20 - nazwaTowaru.length();
          for(int i = 0; i < spacja; i++){
              nazwaTowaru += " ";
          }return nazwaTowaru +" "+ cena + "zł " + liczbaSztuk + "szt:" + obliczWartosc() + "zł.";
      }return "bład";





    }
}
