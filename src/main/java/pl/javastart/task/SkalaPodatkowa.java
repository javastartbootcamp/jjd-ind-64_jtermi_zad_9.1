package pl.javastart.task;

public class SkalaPodatkowa extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochod = przychody - wydatki;
        double pierwszaSkala = 0.18;
        double drugaSkala = 0.32;

        if (dochod <= 10000) {
            return 0;
        }
        if (dochod <= 100_000) {
            return (dochod - 10000) * pierwszaSkala;
        }
        return 90000 * pierwszaSkala
                + (dochod - 100000) * drugaSkala;
    }

    @Override
    public String formaOpodatkowania() {
        return "według skali podatkowej";
    }
}
