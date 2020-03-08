package Próby;

import java.util.Scanner;

public class SzyfCezara {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz swoją wiadomość");

        String wiadomosc = scanner.nextLine().toLowerCase();

        System.out.println("Wpisz o ile miejsc ma być zaszyfrowane:");
        int klucz = scanner.nextInt();

        wiadomosc.toLowerCase();

        String szyfrogram = "";
        for (int i = 0; i < wiadomosc.length(); i++) {
            if (((int) wiadomosc.charAt(i) + klucz) > 122) {
                szyfrogram += (char) (((int) wiadomosc.charAt(i) + klucz)- 26);
            } else {
                szyfrogram += (char) ((int) wiadomosc.charAt(i) + klucz);
            }

        }
        System.out.println(szyfrogram);


    }
}
