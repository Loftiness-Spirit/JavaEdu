package Practice22.Task2;

public class CalculatorController {
    private Calculator model;
    private CalculatorView view;

    public CalculatorController(Calculator model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        this.view.paintCalculator(this.model);
    }
}
