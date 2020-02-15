package zajecia3;

import java.util.Scanner;

public class CiagFibonacciego {

    public static void main(String[] args) {
        int fib1 =1, fib2 = 1;
        int suma = 0;
int fib3=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę:");
        int n = scanner.nextInt();

//for (int i = fib3; i < 1000; i += (fib1+fib2)){
//    System.out.println(fib3);
//    fib1 = fib2;
//    fib2 = fib3;
        System.out.println("fib(1) = " + fib1);
        System.out.println("fib(2) = " + fib2);
for( int i = 3; i <= n; i++){
    suma = fib1 + fib2; //obliczanie kolejnego obiegu petli
    fib1 = fib2;
    fib2 = suma;
    System.out.println("fib("+ i + ") = " + suma);
}

    }
}
