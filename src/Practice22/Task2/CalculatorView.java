package Practice22.Task2;

import java.awt.*;

public class CalculatorView {
    public CalculatorView() {
    }

    void paintCalculator(Calculator calc) {
        calc.pack();
        calc.setLocationRelativeTo((Component)null);
        calc.setDefaultCloseOperation(3);
        calc.setVisible(true);
    }
}
