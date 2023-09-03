package cwiczeniaJava;

import java.util.Scanner;

public class CoffeHomework {
    public static void main(String[] args) {
        //1. ask user for a season of the year
        System.out.println("name a season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. ask user for a number
        System.out.println("give a number:");
        Scanner scanner1 = new Scanner(System.in);
        int  number = scanner.nextInt();


        //3. ask user for an adjective

        System.out.println("give an adjective:");
        Scanner scanner2= new Scanner(System.in);
        String adjective = scanner.next();


        //4. print out the output "On a [adjecitve] [season of the year] day, I drink a minimum of
        // [whole number] cups of coffe."

        System.out.println("On a " + adjective + season + " day, I drink a minimmum of " +number + "cups of coffe ");
    }
}
