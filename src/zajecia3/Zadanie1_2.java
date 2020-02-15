package zajecia3;

import java.util.Scanner;

public class Zadanie1_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        int liczba = scanner.nextInt();

        for(int i =1; i < liczba && i < 16; i++) {
            if (liczba %2  != 0); {

                System.out.print(i + ", ");
                i++;
                //if (i % 2 == 1 print(i))
            }
        }


    }
}
