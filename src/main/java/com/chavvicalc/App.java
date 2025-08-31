package com.chavvicalc;

// Step 1: Setup Maven project and Hello World (already done)
// Step 2: Added menu with quit command and display of A/B
// Step 3: Implemented 'a' and 'b' commands
// Step 4: Implemented '+' and '-' commands
// Step 5: Implemented '*', '/', and 'c' commands

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
            
            // Read user input
            System.out.print("Enter a command: ");
            String input = scan.nextLine();
            if (input.length() > 0) {
                command = Character.toLowerCase(input.charAt(0));
            }

           // Execute command
switch (command) {
    case 'q': // Step 2
        System.out.println("Thank you for using ChavviCalc!");
        break;
    case 'a': // Step 3
        System.out.print("Enter a number for A: ");
        try {
            A = Float.parseFloat(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        }
        break;
    case 'b': // Step 3
        System.out.print("Enter a number for B: ");
        try {
            B = Float.parseFloat(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a number.");
        }
        break;
    case '+': // Step 4
        A = A + B;
        System.out.printf("A = A + B → %.3f\n", A);
        break;
    case '-': // Step 4
        A = A - B;
        System.out.printf("A = A - B → %.3f\n", A);
        break;
    case '*': // Step 5
        A = A * B;
        System.out.printf("A = A * B → %.3f\n", A);
        break;
    case '/': // Step 5
        if (B != 0) {
        A = A / B;
        System.out.printf("A = A / B → %.3f\n", A);
    } else {
        System.out.println("Error: Division by zero is not allowed!");
    }
        break;
    case 'c': // Step 5
        A = 0;
        B = 0;
        System.out.println("Values cleared: A = 0, B = 0");
        break;
        
    default:
        System.out.println("Unknown command!");
}

        }

        scan.close();
    }
}
