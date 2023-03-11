package pl.javastart.task.opodatkowanie;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    public RyczaltEwidencjonowany() {
    }

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return przychody * 0.15;
    }

    @Override
    public String formaOpodatkowania() {
        return "ryczałt ewidencjonowany";
    }
}
