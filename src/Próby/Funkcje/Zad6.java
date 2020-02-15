package Próby.Funkcje;

import java.util.Scanner;


public class Zad6 {

    static String kodowanie (String text, int klucz){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
String wynik= "";

        

        char szyfr[] = new char[text.length()];
        for (int i = 0; i <text.length() ; i++) {
            szyfr[i] = text.charAt(i);
            int warunek = i + klucz;
if (warunek > 26){
    warunek = warunek - 27;
    wynik += alphabet[warunek];
    warunek = 0;
}else{
    wynik += alphabet[warunek];
    warunek = 0;
}


        }
        return wynik;

    }
    static String odszyfruj (String text, int klucz){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String wynik= "";
        char szyfr[] = new char[text.length()];
        for (int i = 0; i <text.length() ; i++) {
            szyfr[i] = text.charAt(i);



        }



        return wynik;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj co mam zaszyfrować: ");
        String text = scanner.nextLine();
        System.out.println("Podaj klucz kodu: ");
        int klucz = scanner.nextInt();
        System.out.println(kodowanie(text, klucz));






    }
}
