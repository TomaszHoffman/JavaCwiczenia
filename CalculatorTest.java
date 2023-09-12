package cwiczeniaJava;

import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner reader_data = new Scanner(System.in);
        System.out.print("Wprowadź pierwszą liczbę: ");
        int firstNumber = reader_data.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        int secondNumber = reader_data.nextInt();

        Calculator calculator = new Calculator();


        int addition = calculator.addition(firstNumber,secondNumber);
        int subtraction = calculator.subtract(firstNumber,secondNumber);
        int multiplication = calculator.multiply(firstNumber,secondNumber);
        float division = calculator.divide(firstNumber,secondNumber);
        int mod = calculator.modulo(firstNumber,secondNumber);

        System.out.println("Wynik dodawania to " + addition +"!");
        System.out.println("Wynik odejmowania to " + subtraction +"!");
        System.out.println("Wynik mnożenia to " + multiplication +"!");
        System.out.println("Wynik dzielenia to " + division +"!") ;
        System.out.println("Wynik modulo to " +mod +"!");



    }
}
