package zajecia1;

import java.util.Scanner;

public class CelcjuszNaFahrenheita {
    public static void main(String[] args) {


       Scanner czytnik = new Scanner(System.in);
       double temC = 0;
               double temF = 0;

        System.out.println("Podaj temperaturę w stopniach celcjusza: ");
        temC = czytnik.nextDouble();
        temF = (temC * 1.8) + 32;
        System.out.println("Podana wartość w Fahrenheita to: " + temF);

        System.out.println("Podaj temperaturę w stopniach Fahrenheita: ");
        temF = czytnik.nextDouble();
        temC = (temF -32) / 1.8;
        System.out.println("Podana wartość w Celcjuszach to: " + temC);

    }

}
