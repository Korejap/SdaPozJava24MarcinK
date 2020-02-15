package zajecia3.arrays;

public class New {
    public static void main(String[] args) {
String text = "Kot";
        int dlugosc = text.length();
        char tabtext[] = new char[dlugosc];
        char tabtextOdwortnie[] = new char[dlugosc];
        for (int i = 0; i < text.length(); i++) {
            char literaOdwrotnie = text.charAt(i);
            // String wynik =

            tabtextOdwortnie[text.length() - i] = literaOdwrotnie;

        }
    }
}
