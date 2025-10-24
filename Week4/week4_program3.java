import java.util.Scanner;

public class week4_program3 {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        System.out.println("Please choose an operation: +, -, , / :");
        char operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! \nPlease use +, -, *, or /");
                break;
        }

        sc.close();

	}

}
