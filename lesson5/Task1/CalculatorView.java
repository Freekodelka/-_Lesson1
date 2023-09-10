import java.util.Scanner;

public class CalculatorView {

    private static Scanner scanner = new Scanner(System.in);

    public double getInputNumber() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public char getOperation() {
        System.out.print("Enter an operation (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void showResult(double result) {
        System.out.println("Result: " + result);
    }

    public void showErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
}