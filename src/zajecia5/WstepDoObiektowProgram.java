package zajecia5;

public class WstepDoObiektowProgram {
// pierwsze przyklady tworzenia obiektow

    public static void main(String[] args) {

        // sudent jest obiektem typu Osoba
        Osoba student = new Osoba();
        student.imie = "Edward";
        student.nazwisko = "Kłapouchy";
        student.waga = 71.5;
        student.wiek = 12;
        student.wzrost = 180;

        //uczen jest obiektrem typu Osoba
        Osoba uczen = new Osoba(); // new Osoba -> wywołanie konstruktora bezparametrowego klasy osoba
        uczen.imie = "Jasiek";
        uczen.nazwisko = "Glizda";
        uczen.wiek = 15;

        // odczyt pola
        String a = student.imie;
        System.out.println("Wartość pola to: " + a);

        // szybszy referowany zapis
        System.out.println("Nazwisko to: " + student.nazwisko);
        System.out.println(student.waga);

        //wartosci drugiego obiektu  -ucznia
        System.out.println(uczen.imie);
        System.out.println(uczen.nazwisko);
        System.out.println(uczen.wiek);

// zmiana nazwiska studenta
        System.out.println("po zmianie nazwiska u studenta");
        student.nazwisko = "Kiepski";
        System.out.println(student.nazwisko);
        System.out.println(uczen.nazwisko);
// tworzymy obiekty z uzyciem konstrukotora parametrowego
        Osoba pracownik = new Osoba("Andrzej", "Wesoły", 25);
        System.out.println(pracownik.imie);
        System.out.println(pracownik.nazwisko);
        System.out.println(pracownik.wiek);

//wywołujemy metode przedstaw sie
        System.out.println(student.przedstawSie());
        System.out.println(uczen.przedstawSie());
        System.out.println(pracownik.przedstawSie());
    }
}
