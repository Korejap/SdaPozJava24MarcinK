package Próby.Kalkulator;

import java.util.Scanner;

public class Wprowadzenie {

    private double a;
    private double b;
    private String opcja;

    public static void kalkulator(double a, double b, String opcja) {
        switch (opcja) {
            case "+":
                System.out.println("Twój wynik to: " + (a + b));
                break;
            case "-":
                System.out.println("Twój wynik to: " + (a - b));
                break;
            case "*":
                System.out.println("Twój wynik to: " + (a * b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Nie wolno dzieli przez 0");
                } else {
                    System.out.println("Twój wynik to: " + (a / b));
                }


                break;
            default:
                System.out.println("Podano błędny znak");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
Kalkulator kalkulator = new Kalkulator();


        System.out.println("Wpisz I liczbę");
        double a = scanner.nextDouble();
        System.out.println("Wpisz II liczbę");

        double b = scanner.nextDouble();
        System.out.println("Wpisz znak działania '(' + , - , *, / ')'");
        String opcja = scanner.next();


        kalkulator(a, b, opcja);





    }
}
