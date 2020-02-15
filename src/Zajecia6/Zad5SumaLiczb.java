package Zajecia6;

public class Zad5SumaLiczb {
    public static void main(String[] args) {

String liczba = "5244";
int suma = 0;
        for (int i = 0; i <liczba.length() ; i++) {
           char c = liczba.charAt(i);
            String wartosc = String.valueOf(c);  // trzeba zrobic bo komenda Integer zle zadziala (komenda dziala dobrze na stringach)
            suma += Integer.valueOf(wartosc);


        }
        System.out.println(suma);


String alfabet = "ABCDEFGHIJKLM";
String wynik = "";
        for (int i = 0; i <alfabet.length() ; i++) {
            wynik += (int)alfabet.charAt(i) + ", ";
        }
        System.out.println(wynik);
    }
}
