package pl.javastart.task.opodatkowanie;

public class Liniowy extends FormaOpodatkowania {

    public Liniowy() {
    }

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochod = przychody - wydatki;
        return dochod * 0.19;
    }

    @Override
    public String formaOpodatkowania() {
        return "podatek liniowy";
    }
}
