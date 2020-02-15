package Próby;

import java.util.Scanner;



public class podzielne8 {


static void liczba(){
    int z = 0;
    for (int i = 1000; i > 0; i--) {

        if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
            z = i;
            System.out.println(z + ", ");


        }
    }

}


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        liczba();


    }
}
