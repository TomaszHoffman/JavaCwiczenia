package cwiczeniaJava;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String dayOfTheWeek = getDayOfTheWeekFromUser();
        System.out.println("You entered: " + dayOfTheWeek);
    }

    public static String getDayOfTheWeekFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number corresponding to a day of the week (1-7):");
        int userInput = scanner.nextInt();
        if (userInput >= 1 && userInput <= 7) {
            return daysOfTheWeek[userInput - 1];
        } else {
            System.out.println("Invalid day of the week. Please enter a number between 1 and 7.");
            return getDayOfTheWeekFromUser();
        }
    }

    private static String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
}