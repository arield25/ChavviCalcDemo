package com.chavvicalc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        float A = 0;
        float B = 0;
        char command = '_';
        Scanner scan = new Scanner(System.in);

        // Pause and Clear screen before starting
        System.out.println("Press Enter to start ChavviCalc...");
        System.out.print("\033[H\033[2J");
        System.out.flush();

        while (command != 'q') {

            // Display menu
            System.out.println("-----------------------------------------------");
            System.out.println("ChavviCalc Menu");
            System.out.println("-----------------------------------------------");
            System.out.printf("A = %.3f       B = %.3f\n", A, B);
            System.out.println("-----------------------------------------------");
            System.out.println("a - Enter number for A");
            System.out.println("b - Enter number for B");
            System.out.println("+ - A = A + B");
            System.out.println("- - A = A - B");
            System.out.println("* - A = A * B");
            System.out.println("/ - A = A / B");
            System.out.println("c - Clear values (A=0, B=0)");
            System.out.println("q - Quit the app");
            System.out.println("-----------------------------------------------");

            // Read user input
            System.out.print("Enter a command: ");
            String input = scan.nextLine();
            if (input.length() > 0) {
                command = Character.toLowerCase(input.charAt(0));
            }

            // Execute command
            switch (command) {
                case 'q':
                    System.out.println("\nThank you for using Chavvi Calc");
                    System.out.println("[Simple Calculator]:");
                    break;

                case 'a':
                    System.out.print("Enter a number for A: ");
                    try {
                        A = Float.parseFloat(scan.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: Invalid input! Please enter a number.");
                    }
                    break;

                case 'b':
                    System.out.print("Enter a number for B: ");
                    try {
                        B = Float.parseFloat(scan.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: Invalid input! Please enter a number.");
                    }
                    break;

                case '+':
                    A = A + B;
                    System.out.printf("Result: A = %.3f\n", A);
                    break;

                case '-':
                    A = A - B;
                    System.out.printf("Result: A = %.3f\n", A);
                    break;

                case '*':
                    A = A * B;
                    System.out.printf("Result: A = %.3f\n", A);
                    break;

                case '/':
                    if (B != 0) {
                        A = A / B;
                        System.out.printf("Result: A = %.3f\n", A);
                    } else {
                        System.out.println("ERROR: Unable to divide by 0!");
                    }
                    break;

                case 'c':
                    A = 0;
                    B = 0;
                    System.out.println("Values cleared: A = 0, B = 0");
                    break;

                default:
                    System.out.println("ERROR: Unknown command!");
            }

            System.out.println(); // Add an empty line for readability
        }

        scan.close();
    }
}
