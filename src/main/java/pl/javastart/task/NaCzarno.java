package pl.javastart.task;

public class NaCzarno extends FormaOpodatkowania {

    public NaCzarno() {
    }

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return 0;
    }

    @Override
    public String formaOpodatkowania() {
        return "na czarno";
    }
}
