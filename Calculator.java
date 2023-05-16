import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performDivision(scanner);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
    
    private static void performAddition(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = num1 + num2;
        System.out.println("Result: " + result);
        
        alterResult(scanner, result);
    }
    
    private static void performSubtraction(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = num1 - num2;
        System.out.println("Result: " + result);
        
        alterResult(scanner, result);
    }
    
    private static void performMultiplication(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = num1 * num2;
        System.out.println("Result: " + result);
        
        alterResult(scanner, result);
    }
    
    private static void performDivision(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result: " + result);
            
            alterResult(scanner, result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    
    private static void alterResult(Scanner scanner, double currentResult) {
        System.out.print("Do you want to alter the result? (yes/no): ");
        String choice = scanner.next();
        
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter the new result: ");
            double newResult = scanner.nextDouble();
            System.out.println("Altered Result: " + newResult);
        } else {
            System.out.println("Final Result: " + currentResult);
        }
    }
}
