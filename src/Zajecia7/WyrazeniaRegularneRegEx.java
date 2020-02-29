package Zajecia7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WyrazeniaRegularneRegEx {
    public static void main(String[] args) {

//todo przejrzec raz jeszcze
        String wyrazenie = "Bardzo lubię uczyć się Javy, ale czasami wolę: JavaScript. Pythona, Scale";
        String[] words = wyrazenie.split("[ .,:]+");
        System.out.println(words.length + "|" + Arrays.toString(words));




        String wzor = "/a/";
        System.out.println(wyrazenie.replaceAll("a", "@"));


    }
}