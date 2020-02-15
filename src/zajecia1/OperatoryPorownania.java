package zajecia1;

public class OperatoryPorownania {

    public static void main(String[] args) {

    int wiek = 18;
    //wersja1
    boolean czyPelnoletni = wiek >= 18;

    System.out.println("Czy wiek mniejszy równy 18? " + (wiek <= 18));
    //kolejnosc wykonwywania dzialan dodaje sie ()
    System.out.println("czy wiek >=18 ? " + czyPelnoletni);
    //wersja2
        System.out.println(wiek == 18);

        System.out.println("Czy wiek rózny od 20? "+ (wiek != 20)); //rozny od 20


        // i = &&, lub = ||, negacja = !


    }
}
