package Próby;

import java.util.Scanner;

public class cos {

    static void kurdebele(double waga, double wzrost){
      double  bmi = waga / (wzrost * wzrost);
        if (bmi < 16) {
            System.out.println("Wygłodzenie");
        }else if(bmi < 17 ){
            System.out.println("Wychudzenie");

        }else if(bmi < 18.5){
            System.out.println("niedowaga");
        }else if(bmi <25){
            System.out.println("OK");
        }else if(bmi >30){
            System.out.println("Nadwaga");
        }else
            System.out.println("Nadwaga");
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//    wygłodzenie 	< 16,0 	niedowaga 	minimalne, ale zwiększony poziom
//    wychudzenie 	16,0–16,99
//    niedowaga 	17,0–18,49
//    pożądana masa ciała 	18,5–24,99 	optimum 	minimalne
//    nadwaga 	25,0–29,99 	nadwaga 	średnie
//    otyłość I stopnia 	30,0–34,99

        double waga = 0, wzrost = 0;
        System.out.println("Podaj swoją wagę: ");
        waga = scanner.nextDouble();
        System.out.println("Podaj swój wzrost w cm: ");
        wzrost = scanner.nextDouble() / 100;

kurdebele(waga, wzrost);



    }
}
