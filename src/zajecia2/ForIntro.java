package zajecia2;

import java.util.Scanner;

public class ForIntro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        // for( zmienna; warunek; modyfikator){}
        //klamry mozna pominac bez klamwerek gdy tylko 1 wiersz kodu obowiazuje
        // nazwana zmiennna w petli jest widoczna tylko w petli
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("Koniec programu");

    }
}
