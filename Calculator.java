import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, S, C): ");
        operator = scanner.next().charAt(0);

        num2 = 0.0;
        if ( operator != 'S' && operator != 'C') {
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
        }

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            //sine
            case 'S':
                num2 = Math.toRadians(num1);
                result = sin(num2);
                System.out.println("Sine: " + result);
                break;
            //Cosine
            case 'C':
                num2 = Math.toRadians(num1);
                result = cos(num2);
                System.out.println("Cosine: " + result);
                break;
            default:
                System.out.println("Error: Invalid operator");
        }

        scanner.close();
    }
}
