package cwiczeniaJava;

import java.util.Scanner;

public class OperatoryPracadomowa {
    public static void main(String[] args) {
        Scanner reader_data = new Scanner(System.in);
        System.out.print("Wprowadź pierwszą liczbę: ");
        int firstNumber = reader_data.nextInt();
        System.out.print("Wprowadź drugą liczbę: ");
        int secondNumber = reader_data.nextInt();



        System.out.println("a > b : " + (firstNumber > secondNumber));
        System.out.println("a < b : " + (firstNumber < secondNumber));
        System.out.println("a <= b : " + (firstNumber <= secondNumber));
        System.out.println("a == b : " + (firstNumber == secondNumber));
        System.out.println("a != b : " + (firstNumber != secondNumber));
    }
}
