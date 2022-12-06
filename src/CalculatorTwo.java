import java.util.Scanner;

public class CalculatorTwo {
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
        switch (operand) {
            case 1:
                System.out.print(operandOne + " + " + operandTwo + " = " + (operandOne + operandTwo));
                break;
            case 2:
                System.out.print(operandOne + " + " + operandTwo + " = " + (operandOne - operandTwo));
                break;
            case 3:
                System.out.print(operandOne + " + " + operandTwo + " = " + (operandOne * operandTwo));
                break;
            case 4:
                if (operandTwo == 0) {
                    System.out.print("Error: Undefined Value");
                } else {
                    System.out.print(operandOne + " + " + operandTwo + " = " + (operandOne / operandTwo));
                }
                break;
            default:
                System.out.print("Invalid Input! Please, try again.");
        }
    }
}