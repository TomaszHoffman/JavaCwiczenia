package cwiczeniaJava;

import java.util.Scanner;
public class ObliczanieWynagrodzenia {
    public static void main(String[] args) {
        //znane zmienne

        int stawka =30;
        int maxGodzin =20;

        //dodanie nieznanych zmiennych

        System.out.println("ile godzin przepracowałeś w tym tygodniu?");
        Scanner scanner = new Scanner(System.in);
        double godzinyPrzepracowane = scanner.nextDouble();

        //sprawdzenie wprowadzonych danych

        while (godzinyPrzepracowane > maxGodzin || godzinyPrzepracowane < 1){
            System.out.println("Nieprawdiłowa wartość. Liczba godzin musi być w przedziale od 1 do 20. Spróbuj ponownie");
            godzinyPrzepracowane = scanner.nextDouble();
        }

        scanner.close();

        //obliczanie wynagrodzenia

        double wynagrodzenie = stawka * godzinyPrzepracowane;
        System.out.println("Wynagrodzenie to " + wynagrodzenie + " złotych ");
    }
}
