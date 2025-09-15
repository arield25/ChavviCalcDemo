package com.chavvicalc;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        float a = 0; 
        float b = 0;
        char command = '_';
        Scanner scan = new Scanner(System.in); 

        System.out.println("Press Enter to start ChavviCalc...");
        System.out.print("\033[H\033[2J");
        System.out.flush();

        while (command != 'q') {
            printMenu(a, b);
            command = getUserCommand(scan);

            switch (command) {
                case 'q':
                    quitApp();
                    break;
                case 'a':
                    a = readNumber(scan, "a");
                    break;
                case 'b':
                    b = readNumber(scan, "b");
                    break;
                case '+':
                    a = add(a, b);
                    break;
                case '-':
                    a = subtract(a, b);
                    break;
                case '*':
                    a = multiply(a, b);
                    break;
                case '/':
                    a = divide(a, b);
                    break;
                case 'c':
                    a = 0;
                    b = 0;
                    clearValues();
                    break;
                default:
                    System.out.println("ERROR: Unknown command!");
            }

            System.out.println(); // readability
        }

        scan.close();
    }

    // --- Helper Methods ---

    public static void printMenu(float a, float b) {
        System.out.println("-----------------------------------------------");
        System.out.println("ChavviCalc Menu");
        System.out.println("-----------------------------------------------");
        System.out.printf("a = %.3f       b = %.3f\n", a, b);
        System.out.println("-----------------------------------------------");
        System.out.println("a - Enter number for a");
        System.out.println("b - Enter number for b");
        System.out.println("+ - a = a + b");
        System.out.println("- - a = a - b");
        System.out.println("* - a = a * b");
        System.out.println("/ - a = a / b");
        System.out.println("c - Clear values (a=0, b=0)");
        System.out.println("q - Quit the app");
        System.out.println("-----------------------------------------------");
    }

    public static char getUserCommand(Scanner scan) {
        System.out.print("Enter a command: ");
        String input = scan.nextLine();
        return (input.length() > 0) ? Character.toLowerCase(input.charAt(0)) : '_';
    }

    public static float readNumber(Scanner scan, String variableName) {
        System.out.print("Enter a number for " + variableName + ": ");
        try {
            return Float.parseFloat(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid input! Please enter a number.");
            return 0;
        }
    }

    public static float add(float a, float b) {
        float result = a + b;
        System.out.printf("Result: a = %.3f\n", result);
        return result;
    }

    public static float subtract(float a, float b) {
        float result = a - b;
        System.out.printf("Result: a = %.3f\n", result);
        return result;
    }

    public static float multiply(float a, float b) {
        float result = a * b;
        System.out.printf("Result: a = %.3f\n", result);
        return result;
    }

    public static float divide(float a, float b) {
        if (b != 0) {
            float result = a / b;
            System.out.printf("Result: a = %.3f\n", result);
            return result;
        } else {
            System.out.println("ERROR: Unable to divide by 0!");
            return a; // unchanged
        }
    }

    public static void clearValues() {
        System.out.println("Values cleared: a = 0, b = 0");
    }

    public static void quitApp() {
        System.out.println("\nThank you for using ChavviCalc");
        System.out.println("[Simple Calculator]:");
    }
}
