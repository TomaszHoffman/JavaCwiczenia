package cwiczeniaJava;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner reader_data = new Scanner(System.in);
        System.out.print("Wprowadź pierwszą liczbę: ");
        int firstNumber = reader_data.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        int secondNumber = reader_data.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;

        System.out.println("Wynik dodawania to " + addition +"!");
        System.out.println("Wynik odejmowania to " + subtraction +"!");
        System.out.println("Wynik mnożenia to " + multiplication +"!");
        System.out.println("Wynik dzielenia to " + division +"!") ;
        System.out.println("Wynik modulo to " +mod +"!");



    }
}
