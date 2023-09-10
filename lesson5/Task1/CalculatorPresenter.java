public class CalculatorPresenter {

    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void startCalculator() {
        double number1 = view.getInputNumber();
        char operation = view.getOperation();
        double number2 = view.getInputNumber();

        double result;
        try {
            switch (operation) {
                case '+':
                    result = model.add(number1, number2);
                    break;
                case '-':
                    result = model.subtract(number1, number2);
                    break;
                case '*':
                    result = model.multiply(number1, number2);
                    break;
                case '/':
                    result = model.divide(number1, number2);
                    break;
                default:
                    view.showErrorMessage("Invalid operation");
                    return;
            }
            view.showResult(result);
        } catch (ArithmeticException e) {
            view.showErrorMessage(e.getMessage());
        }
    }
}