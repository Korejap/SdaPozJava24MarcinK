package zajecia2;

import java.util.Scanner;

public class IfElseIntro {

    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj swój wiek: ");
        int wiek = czytnik.nextInt();

        //debugowanie, wykonywanie programu do okresonego punktu Breakpoint
// czerwona kropka jest stop przed wykonaniem kodu
        //f8 przejdz kolejnej instrukcji w tym samym pliku
        // breakpint lepiej po Scanner

        if (wiek >= 18) {

            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Nie jesteś pełnoletni");

System.out.println("Kończę pracę");
        }

    }
}


