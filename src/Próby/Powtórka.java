package Próby;

import java.util.Scanner;

public class Powtórka {
 static void oblicz1 (){
     int liczba = 0;

     while(liczba <101){
         System.out.println(liczba);
         liczba++;

     }

 }

 static void oblicz2 (){
     int liczba = 0;
     while(liczba <50){
         liczba = liczba + 2;
         System.out.print(liczba + ", ");
     }

 }
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

   oblicz1();
   oblicz2();


    }
}
