package zajecia3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zadanie2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość A: ");
        int a = scanner.nextInt();
        System.out.println("Podaj wartość B więszką od A: ");
        int b = scanner.nextInt();
//        while(b<a){
//            System.out.println("Podaj wartośc B większą od A: ");
//            b = scanner.nextInt();
        if (a < b) {
            int suma = 0;
            for (int i = a; i <= b; i++) {
                suma += i;
                // 2 wersja
                suma = 0;
                int index = a;
                while (index <= b) {
                    suma += index;
                    index++;
                    System.out.println("Suma przedzialu to:" + suma);
                }
            }
            System.out.println("Suma przedzialu to:" + suma);
        } else {
            System.out.println("Podaj wartośc B większą od A: ");


        }


    }
}
