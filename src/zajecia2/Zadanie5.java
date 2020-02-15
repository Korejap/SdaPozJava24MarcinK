package zajecia2;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


/*if ((cena > 100 && cena < 10_000) && (rata > 6 && rata <48)){
        System.out.println("obliczamy raty...");
        double odstetki = 0;
        if (rata <= 12){
        }
        System.out.println("Rata wynosi: " + odsetki);
        else

        System.out.println("Zle dane wejsciowe, uruchom ponownie");
        }


 */
//        odsetki = 1.025 * cena / rata;
//        else if (rata <= 24){
//        odsetki = 1.05 * cena / rata;
//        }else {
//        odsetki = 1.05 * cena / rata;

        System.out.println("Podaj cenę produktu mieszczącą się w przedziale od 100 zł do 10 tyś zł: ");
        double cena = scanner.nextDouble();
        if (cena < 100 || cena > 10000) {
            System.out.println("Podaj ponownie POPRAWNĄ cenę produktu mieszczącą się w przedziale od 100 zł do 10 tyś zł: ");
            cena = scanner.nextDouble();
        }
        System.out.println("Podaj liczbę rat od 6 do 48: ");
        double rata = scanner.nextDouble();

        if (rata < 5 || rata > 48) {
            System.out.println("Podaj ponownie POPRAWNĄ liczbę rat od 6 do 48: ");
            rata = scanner.nextDouble();
        } else if (rata >= 6 || rata <= 12) {
            double wynik = (cena / rata) + ((cena * 0.025) / 12);
            System.out.println("Twoja miesięczna rata to: " + wynik);

        } else if (rata < 25) {
            double wynik = (cena / rata) + ((cena * 0.05) / 12);
            System.out.println("Twoja miesięczna rata to: " + wynik);
        } else {
            double wynik = (cena / rata) + ((cena * 0.1) / 12);
            System.out.println("Twoja miesięczna rata to: " + wynik);


        }


    }
}


