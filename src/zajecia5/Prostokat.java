package zajecia5;


import java.util.Scanner;

public class Prostokat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double blokA = scanner.nextDouble();
        double blokB = scanner.nextDouble();
        Matematyka prostokat1 = new Matematyka(blokA, blokB);

        Matematyka prostokat2 = new Matematyka(22,10);
        Matematyka prostokat3 = new Matematyka(9,10);
        System.out.println("pole wynosi: ");
        System.out.println(prostokat1.obliczamPole());
        System.out.println(prostokat2.obliczamPole());
        System.out.println(prostokat3.obliczamPole());
        System.out.println("Obwód wynosi: ");
        System.out.println(prostokat1.obliczamObwod());
        System.out.println(prostokat2.obliczamObwod());
        System.out.println(prostokat3.obliczamObwod());
    }
        }
