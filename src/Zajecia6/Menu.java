package Zajecia6;

import java.util.Scanner;

public class Menu {
public void printMenu(){

}


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Podaj opcję:");
        System.out.println("Menu" +'\n' + 1 + '\n' + 3 + '\n' + 4 + '\n' + 5 + '\n' + 6 + '\n'
                + 7 + '\n' + 8);
     int opcja = sc.nextInt();
switch(opcja){ // gto gdzie indziej
    case 1:

        break;

    default:
        throw new IllegalStateException("Unexpected value: " + opcja);
}

    }
}
