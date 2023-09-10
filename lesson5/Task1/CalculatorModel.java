public class CalculatorModel {

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) throws ArithmeticException {
        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return number1 / number2;
    }
}