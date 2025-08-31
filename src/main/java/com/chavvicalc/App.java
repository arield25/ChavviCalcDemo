package com.chavvicalc;

// test change
// test 1 change

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        float A = 0;
        float B = 0;
        char command = '_';
        Scanner scan = new Scanner(System.in);

        while (command != 'q') {
            // Display menu
            System.out.println("=== ChavviCalc Menu ===");
            System.out.println("a - Enter number for A");
            System.out.println("b - Enter number for B");
            System.out.println("+ - A = A + B");
            System.out.println("- - A = A - B");
            System.out.println("* - A = A * B");
            System.out.println("/ - A = A / B");
            System.out.println("c - Clear values (A=0, B=0)");
            System.out.println("q - Quit the app");
            System.out.printf("Current values: A = %.3f, B = %.3f\n", A, B);
            System.out.println("VS Code → GitHub Desktop test");


            // Read user input
            System.out.print("Enter a command: ");
            String input = scan.nextLine();
            if (input.length() > 0) {
                command = Character.toLowerCase(input.charAt(0));
            }

            // Execute command
            if (command == 'q') {
                System.out.println("Thank you for using ChavviCalc!");
            } else {
                System.out.println("You entered: " + command);
            }
        }

        scan.close();
    }
}
