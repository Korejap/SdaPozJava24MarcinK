package Próby.Kalkulator;

import javax.sound.midi.Soundbank;

public class Kalkulator {


    private double a;
    private double b;
    private String opcja;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getOpcja() {
        return opcja;
    }

    public void setOpcja(String opcja) {
        this.opcja = opcja;
    }

    public void kalkulator(double a, double b, String opcja) {
        switch (opcja) {
            case "+":
                System.out.println("Twój wynik to: " + (this.a + this.b));
            break;
            case "-":
                System.out.println("Twój wynik to: " + (this.a - this.b));
                break;
            case "*":
                System.out.println("Twój wynik to: " + (this.a * this.b));
                break;
            case "/":
                if(this.b == 0){
                    System.out.println("Nie wolno dzieli przez )");
                }else{
                    System.out.println("Twój wynik to: " + (this.a / this.b));
                }


                break;
            default:
                System.out.println("Podano błędny znak");
        }



    }
}