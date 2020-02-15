package zajecia2;

import java.util.Scanner;

public class Zadanie4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj swój dochód: ");
        double dochod = scanner.nextDouble();
// literał 85528 brzydko, lepiej zrobic zmienna z tego, spojrzec jak on to zrobil
        //final double PROG_PODATKOWY = 85528;

        if(dochod <= 85528){
            double wynik = (dochod * 0.18) - 556.02;
                    System.out.println("Należny podatek wynosi: " + wynik);
        }else {
            double wynik = (14839.02 +  ((dochod - 85528)*0.32));
            System.out.println("Należny podatek wynosi: " + wynik);
        }

    }

}
