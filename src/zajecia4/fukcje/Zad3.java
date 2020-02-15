package zajecia4.fukcje;

import java.util.Scanner;

public class Zad3 {

    static boolean isPalindrome(String text){
        //kajak -> dlugosc wynosi 5; 5/2 = 2

        for(int i= 0; i < text.length()/2; i++) {
            //porownujemy odpowiadajace sobie lieter
            // pierwsza z ostatnia
            if (text.charAt(i) == text.charAt(text.length() - 1 - i)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj tekst palindron:");
        String text = scanner.nextLine();
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("tekst"));
        System.out.println(isPalindrome(text));
    }
}
