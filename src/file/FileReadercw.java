package file;

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReadercw {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new FileReader("Test.txt");
            System.out.println(new File(".").getCanonicalPath());
            outputStream = new PrintWriter(new FileWriter("characteroutput.txt"));
            int c;
            while ((c = inputStream.read()) != -1) {
                //     System.out.print(c + " ");
                if (c > 65 && c < 123) {
                    if (c + 5 < 123) {
                        //todo MODULO ROZWIAZANIE (((c-65)+offset)26)+65  WZOR NA BUFOR PRZESTAWNY
                        //todo (((c - 65)+65)26)+65) Do duzych liter
                        System.out.print((char) (c + 5));
                        outputStream.print((char) (c + 5));
                    } else {
                        System.out.print((char) (c + 5 - 26));
                        outputStream.print((char) (c + 5 - 26));
                    }
                } else {
                    System.out.print((char) c);
                    outputStream.print((char) c);
                }
            }

        } catch (IOException e) {
            System.err.println("Problem z plikiem: " + e.getMessage());

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}

