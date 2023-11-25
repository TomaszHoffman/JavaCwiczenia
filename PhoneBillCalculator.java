package cwiczeniaJava;

import java.util.Scanner;

public class PhoneBillCalculator {

    /*prosty kalkulator całości rachunku telefonicznego, który zawiera:
    - kwote podstawowa abonamentu
    - liczbe minut w abonamencie
    - oplate 0.25 za kazda andprogramowa minute
    - podatek 15%
    - kalkulator bedzie posiadal metody na oblicznei podatku, minut poza abonamentem, i
    calosc rachunku
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz bazową opłatę za abonament :");
        double abonamentPodst = scanner.nextDouble();

        System.out.println("Wprowadż ilość minut poza abonamentem:");
        double liczbaMinutpoza = scanner.nextDouble();

        scanner.close();

        double oplataPozaAbo = obliczMinutyPoza(liczbaMinutpoza);
        double podatek = obliczKwotePodatku(abonamentPodst + oplataPozaAbo);

        obliczIwyswietlRachunek(abonamentPodst, oplataPozaAbo, podatek);

    }

    public static double obliczMinutyPoza(double dodatkoweMinuty) {
        double stawka = 0.25;
        double minutyPoza = dodatkoweMinuty * stawka;
        return minutyPoza;
    }

    public static double obliczKwotePodatku(double razem) {
        double stawka = 0.15;
        double podatek = razem * stawka;
        return podatek;
    }

    public static void obliczIwyswietlRachunek(double abonament, double minuty, double podatek) {
        double caloscDoZaplaty = abonament + minuty + podatek;

        System.out.println("Rachunek telefoniczny calość");
        System.out.println("Abonament: $" + String.format("%.2f", abonament));
        System.out.println("Minuty poza abonamentem: $" + String.format("%.2f", +minuty));
        System.out.println("Podatek: $" + String.format("%.2f", +podatek));
        System.out.println("Cały rachunek do zapłaty $" + String.format("%.2f", +caloscDoZaplaty));
    }


}
