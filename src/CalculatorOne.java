import java.util.Scanner;

public class CalculatorOne {
    public static void main(String[] args) {
        int operandOne, operandTwo, operand;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        operandOne = scanner.nextInt();
        System.out.print("Enter second number: ");
        operandTwo = scanner.nextInt();
        System.out.println("Select operation.\n1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide");
        System.out.print("Enter your choice (1/2/3/4): ");
        operand = scanner.nextInt();
        if (operand == 1) {
            System.out.print(operandOne + " + " + operandTwo + " = " + (operandOne + operandTwo));
        } else if (operand == 2) {
            System.out.print(operandOne + " + " + operandTwo + " = " + (operandOne - operandTwo));
        } else if (operand == 3) {
            System.out.print(operandOne + " + " + operandTwo + " = " + (operandOne * operandTwo));
        } else if (operand == 4) {
            if (operandTwo == 0) {
                System.out.print("Error: Undefined Value");
            } else {
                System.out.print(operandOne + " + " + operandTwo + " = " + (operandOne / operandTwo));
            }
        } else {
            System.out.print("Invalid Input! Please, try again.");
        }
    }
}
