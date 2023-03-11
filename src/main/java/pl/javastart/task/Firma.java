package pl.javastart.task;

import pl.javastart.task.opodatkowanie.FormaOpodatkowania;

import java.util.Arrays;

public class Firma {

    private String nazwa;
    private double[] incomeValues = new double[10];
    private String[] incomeTitles = new String[10];
    private int incomesCounter = 0;
    private double[] costValues = new double[10];
    private String[] costTitles = new String[10];
    private int costsCounter;
    private FormaOpodatkowania formaOpodatkowania;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {

        double sumaWydatkow = zsumujWydatki();
        double sumaPrzychodow = zsumujPrzychody();

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %S\n", formaOpodatkowania.formaOpodatkowania());
        System.out.printf("Suma przychodów: %.2f zł\n", sumaPrzychodow);
        System.out.printf("Suma wydatków: %.2f zł\n", sumaWydatkow);
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(sumaPrzychodow, sumaWydatkow));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        double result = 0;
        for (int i = 0; i < costsCounter; i++) {
            result += costValues[i];
        }
        return result;
    }

    private double zsumujPrzychody() {
        double result = 0;
        for (int i = 0; i < incomesCounter; i++) {
            result += incomeValues[i];
        }
        return result;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        ensureCapacityForIncomes();
        incomeTitles[incomesCounter] = nazwa;
        incomeValues[incomesCounter] = wartosc;
        incomesCounter++;
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        ensureCapacityForCosts();
        costTitles[costsCounter] = nazwa;
        costValues[costsCounter] = wartosc;
        costsCounter++;
    }

    private void ensureCapacityForIncomes() {
        if (incomesCounter >= incomeTitles.length) {
            incomeTitles = Arrays.copyOf(incomeTitles, incomeTitles.length * 2);
            incomeValues = Arrays.copyOf(incomeValues, incomeValues.length * 2);
        }
    }

    private void ensureCapacityForCosts() {
        if (costsCounter >= costValues.length) {
            costValues = Arrays.copyOf(costValues, costValues.length * 2);
            costTitles = Arrays.copyOf(costTitles, costTitles.length * 2);
        }
    }
}
