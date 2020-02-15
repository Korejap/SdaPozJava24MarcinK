package zajecia4;

import java.util.Random;

public class Tablica5x5 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[][] macierz = new int[3][5];//[wierze][kolumny]

//        System.out.println(macierz.length); // wiersze
//        System.out.println(macierz[0].length); //kolumny
        System.out.println();
// wypelnianie macierzy losowymi liczbami

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                macierz[i][j] = rand.nextInt(10);
            }
        }
//wyswietlanie wyniku


        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[0].length; j++) {
                System.out.print(macierz[i][j] + ", ");
            }
            //po wypisaniu calego wierzsza przejdz do nowej lini
            System.out.println();
        }


//szukanie max w wierszach
        // todo: Nie rozumiem, do powtorki

        int[] maxWWierszach = new int[macierz.length];

        for (int i = 0; i < macierz.length; i++) {
            int max = macierz[i][0];
            for (int j = 0; j < macierz[0].length; j++) {
                //w petli wewnetrznej przechodzimu cały wiersz, tutaj szukamy max
                if (max < macierz[i][j]) {
                    max = macierz[i][j];

                }
            }
            //po przejsciu calego wiersza znalezlismy max, wiec wpisujemy go do tablicy
            maxWWierszach[i] = max;

        }
        System.out.println("Max wartości w wierszach to: ");
        for (int wWierszach : maxWWierszach) {
        }
    }
}

