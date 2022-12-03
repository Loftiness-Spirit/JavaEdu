package Practice22.Task2;

public class CalculatorTest {
    public CalculatorTest() {
    }

    public static void main(String[] args) {
        Calculator model = new Calculator();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);
        controller.updateView();
    }
}
