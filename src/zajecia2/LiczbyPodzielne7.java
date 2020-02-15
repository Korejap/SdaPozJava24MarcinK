package zajecia2;

import java.util.Scanner;

public class LiczbyPodzielne7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in) ;
  //  moja wersja
        //  int liczba = 1;
  //      while( liczba <100){
     //       if (liczba%2 == 0){
      //          System.out.println(liczba);
//            }else
      //          liczba++;
/* wersja prowadzacego 1
for (int i = 1; i <=100; i++){
if (i % 2 == 0) {
System.out.print(i + ", ");

WERSJA 2
for (int i = 0; i<= 10; i+=2){}


Nieparzyste od 100 w doł
for (int i = 99, i>=1; i -=2){ }
 */
            int liczba = 200;
            while( liczba >=200 && liczba <300){
                if (liczba%2 != 0){
                    System.out.print(liczba + ", ");
                    liczba++;
                }else
                    liczba++;




                    }
        for(int i = 7; i < 500; i ++) {
            if (i % 7 == 0) {
                System.out.print(i + ", ");
                }

//zadanie 3 suma liczb od 0 do 100;
            int suma = 0;
i=0;
            for( i = 0; i <=100; i++){
                suma += i;
                //alternatywnie
                //suma=suma + i;
            }
            System.out.println("suma: " +suma);
        }

        System.out.println("Koniec programu");
        for (int i = 99; i>=1; i -= 2){
            System.out.println(i);}
    }
}
