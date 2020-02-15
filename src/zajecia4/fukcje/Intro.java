package zajecia4.fukcje;

public class Intro {
    //funcje definujemy w KLASIE a nie w MAIN,
    //prosta funkcja pobierajaca 2 argumenty i zwracajaca jej sume

    static int dodaj(int a, int b){
        return a + b;
    }
// funkcja nic niezwracajaca ale wypisuje zawartosc tablicy

    static void printArray(String[] array) {
        System.out.print("[ ");
        for (String i : array) {
            System.out.print(i + ", ");
        }
        // kasujemy ostatni przecinek
  // inne rozwiazanie z uzyciem StringBuilder
        System.out.print('\b');
        System.out.print('\b');
        System.out.print(" ]");
        }
// Funkcja do obliczania n-tego wyrazu ciagu fibonacciego

static int fibonacci (int n) {
    int fib1 = 1;
    int fib2 = 1;
    int suma = 0;
    for (int i = 3; i <= n; i++) {
    suma = fib1 + fib2;
    fib2 = suma;
}
    return suma;
}

    public static void main(String[] args) { //funkcja

        //funcje wywołujemy po nazwie
        int pierwszaL = 10;
        int drugaL = 20;

        int wynik = dodaj(pierwszaL, drugaL);
        System.out.println("Wynik dodawania to: " + wynik);
//
String[] imiona = {"Jan" + "Tomek" + "Jerzy"};
printArray(imiona);

//ciag fibonacciego
        //todo: cos nie poszło, spr pozniej z org, prawdopodobnie cos we fukcji

int liczba = fibonacci(10);
        System.out.println("Fibonacci od 10 to:" + liczba);
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
    }
}
