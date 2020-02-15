package zajecia3;

import java.util.Scanner;

public class Zadanie3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Wprowadź liczbę: ");
int n = scanner.nextInt();
// I rozwiazanie
for(int i = 0; Math.pow(2,i) <= n; i++){
    System.out.println(Math.pow(2, i));
}
//II rozwiazanie
        for(int i = 1; i < n; i*=2){
            System.out.println(i);
        }
        // \n nowa lina \t tabulator \" cudzyslow \\ back slech

    }
}
