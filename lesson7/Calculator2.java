class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realPart = this.real + other.getReal();
        double imaginaryPart = this.imaginary + other.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.getReal() - this.imaginary * other.getImaginary();
        double imaginaryPart = this.real * other.getImaginary() + this.imaginary * other.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double divisor = Math.pow(other.getReal(), 2) + Math.pow(other.getImaginary(), 2);
        double realPart = (this.real * other.getReal() + this.imaginary * other.getImaginary()) / divisor;
        double imaginaryPart = (this.imaginary * other.getReal() - this.real * other.getImaginary()) / divisor;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}

interface Calculator {
    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);
    void log(String message);
}

class SimpleCalculator implements Calculator {
    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.add(num2);
        log(num1 + " + " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.multiply(num2);
        log(num1 + " * " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.divide(num2);
        log(num1 + " / " + num2 + " = " + result);
        return result;
    }

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}

class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new SimpleCalculator();

        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, 5);

        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber division = calculator.divide(num1, num2);
    }
}