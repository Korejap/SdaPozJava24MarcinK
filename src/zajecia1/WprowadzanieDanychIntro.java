package zajecia1;

import java.util.Scanner; // to wchodzi tu jak pisze sie scanner i enter

public class WprowadzanieDanychIntro {

    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in); //aby moc czytac dane od uzytkownika
        //nalezy utworzyc obiekt typu Scanner wg nastepujacej składni
        //czytnik to zmienna/obiekt  typu Scanner
       // czytnik - mozna zmienic nazwe tej zmiennej, zwykle jest scanner




        // wiek to zmienna typu int
        //  w momencie pisania kodu nie wiemy ile uzytk ma lat i trzeba ustalic jakas zmienna
        String imie;
        double wiek = 0;
         System.out.println("Podaj swoje imie: ");
         imie = czytnik.nextLine(); //tylko next odczytuje tylko pierwszy wyraz
         System.out.println("Witaj " + imie + "!");

        System.out.println("Ile masz lat: ");
        wiek = czytnik.nextDouble();  // nextINt zmienna int, samo next to String, nexdouble double

        System.out.println("Witaj, " + imie + " Masz " + wiek + ".");




    }
}
