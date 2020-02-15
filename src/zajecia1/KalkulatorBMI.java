package zajecia1;


import java.util.Scanner;

public class KalkulatorBMI {

    public static void main(String[] args) {

        Scanner czytnik = new Scanner(System.in);


        double masa = 0;
        double wzrost = 0;

        System.out.println("Wprowadź swoją masę w kilogramach");
        masa = czytnik.nextDouble();
        System.out.println("Wprowadź swój wzrost w centymetrach");
        wzrost = czytnik.nextDouble() / 100;

        double bmi = masa / (Math.pow(wzrost, 2));
        // Math.pow i tam sie wybiera co sie chce np. potegi)
        //CRTl + Q    pobiera dokumentacje przy wpisie
        // Math.pow(2, 5);  Dwa do piątej
        System.out.println("Twoje BMI wynosi: " + bmi);


// warunek
// if(warunek true albo false){to co się wykona jeśli warunek będzie prawdziwy}
        //else (jesli nie {to wykonaj to}
// kod nadmiarowy, ponizej w komentarzu znajduje sie prawidlowy
        if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Waga OK - waga w normie");
        } else if (bmi < 18.5) {
            System.out.println("Niedowaga");
        }else if (bmi <=29.99){
            System.out.println("Nadwaga");
        }else{
            System.out.println("Otyłość");
        }
/*if (bmi < 18.5){
print
}else if (bmi <25) {
}else if (bmi < 30) {
}else {
}

 */
        // crtl + alt + L  - układanie kodu, format
    }
}
