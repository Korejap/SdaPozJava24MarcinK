package zajecia5;

public class Matematyka {

    public double blokA;
    public double blokB;

    public Matematyka (double blokA, double blokB){
        this.blokA = blokA;
        this.blokB = blokB;
    }
    public double obliczamPole() {
        double pole = this.blokA * this.blokB;
        return  pole;
    }




    public double obliczamObwod(){
        double obwod = this.blokA*2 + this.blokB*2;
        return obwod;

    }
}
