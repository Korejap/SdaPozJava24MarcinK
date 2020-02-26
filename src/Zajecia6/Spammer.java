package Zajecia6;

import java.util.Scanner;

public class Spammer {

static String slowo = "";
static int liczbaPowtorzen = 0;

private static void spamowanie(String slowo, int liczbaPowtorzen){

    do{System.out.println(slowo);
    liczbaPowtorzen--;
    }
    while(liczbaPowtorzen >= 1);
}





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podaj słowo do spammowania");
        slowo = sc.nextLine();
        System.out.println("Podaj liczbe wyświetleń slowa");
liczbaPowtorzen = sc.nextInt();
spamowanie(slowo, liczbaPowtorzen);





    }
}
