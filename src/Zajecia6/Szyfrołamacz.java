package Zajecia6;

import java.util.Random;
import java.util.Scanner;

public class Szyfrołamacz {
    static int szyfr;
   static int zycie = 5;
    Random random = new Random();



    public int  ustawSzyfr(){
        for (int i = 0; i <szyfr ; i++) {
            int haslo = random.nextInt(10000);
            this.szyfr= haslo;

        }
        return szyfr;
    }
public void sprawdzHaslo( int szyfr, int odpowiedz ){
        if(szyfr > odpowiedz){
            System.out.println("Podana liczba jest mniejsza od szyfru.");
            System.out.println("Tracisz jedno życie.");
            zycie--;
        }else if(szyfr < odpowiedz){
            System.out.println("Podana liczba jest większa od szyfru.");
            System.out.println("Tracisz jedno życie.");
            zycie--;
        }else if(szyfr == odpowiedz){
            System.out.println("Gratulacje! Podałeś prawidłową odpowiedź!");

        }

}


}
