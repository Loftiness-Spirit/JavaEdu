package Practice22.Task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JButton jbtNum1;
    private JButton jbtNum2;
    private JButton jbtNum3;
    private JButton jbtNum4;
    private JButton jbtNum5;
    private JButton jbtNum6;
    private JButton jbtNum7;
    private JButton jbtNum8;
    private JButton jbtNum9;
    private JButton jbtNum0;
    private JButton jbtAdd;
    private JButton jbtSubtract;
    private JButton jbtMultiply;
    private JButton jbtDivide;
    private JButton jbtSolve;
    private JButton jbtClear;
    private JButton jbtDecimal;
    private double TEMP;
    private double START;
    private double SolveTEMP;
    private JTextField jtfResult;
    private boolean addBool = false;
    private boolean subBool = false;
    private boolean divBool = false;
    private boolean mulBool = false;
    private boolean operatorClicked = false;
    private boolean justSolved = false;
    String display = "0";

    public Calculator() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 4));
        p1.add(this.jbtNum7 = new JButton("7"));
        p1.add(this.jbtNum8 = new JButton("8"));
        p1.add(this.jbtNum9 = new JButton("9"));
        p1.add(this.jbtAdd = new JButton("+"));
        p1.add(this.jbtNum4 = new JButton("4"));
        p1.add(this.jbtNum5 = new JButton("5"));
        p1.add(this.jbtNum6 = new JButton("6"));
        p1.add(this.jbtSubtract = new JButton("-"));
        p1.add(this.jbtNum1 = new JButton("1"));
        p1.add(this.jbtNum2 = new JButton("2"));
        p1.add(this.jbtNum3 = new JButton("3"));
        p1.add(this.jbtDivide = new JButton("/"));
        p1.add(this.jbtNum0 = new JButton("0"));
        p1.add(this.jbtDecimal = new JButton("."));
        p1.add(this.jbtSolve = new JButton("="));
        p1.add(this.jbtMultiply = new JButton("*"));
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(this.jtfResult = new JTextField(20));
        this.jtfResult.setHorizontalAlignment(4);
        this.jtfResult.setEditable(false);
        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(1, 2));
        p3.add(this.jbtClear = new JButton("C"));
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(p2, "North");
        p.add(p1, "Center");
        p.add(p3, "South");
        this.add(p);
        this.jbtNum1.addActionListener(new ListenToButton());
        this.jbtNum2.addActionListener(new ListenToButton());
        this.jbtNum3.addActionListener(new ListenToButton());
        this.jbtNum4.addActionListener(new ListenToButton());
        this.jbtNum5.addActionListener(new ListenToButton());
        this.jbtNum6.addActionListener(new ListenToButton());
        this.jbtNum7.addActionListener(new ListenToButton());
        this.jbtNum8.addActionListener(new ListenToButton());
        this.jbtNum9.addActionListener(new ListenToButton());
        this.jbtNum0.addActionListener(new ListenToButton());
        this.jbtDecimal.addActionListener(new ListenToButton());
        this.jbtAdd.addActionListener(new ListenToAdd());
        this.jbtSubtract.addActionListener(new ListenToSubtract());
        this.jbtMultiply.addActionListener(new ListenToMultiply());
        this.jbtDivide.addActionListener(new ListenToDivide());
        this.jbtSolve.addActionListener(new ListenToSolve());
        this.jbtClear.addActionListener(new ListenToClear());
    }

    public void solveMethod(double d) {
        if (this.addBool) {
            this.TEMP += this.START;
        } else if (this.subBool) {
            this.TEMP = this.START - this.TEMP;
        } else if (this.mulBool) {
            this.TEMP = this.START * this.TEMP;
        } else if (this.divBool) {
            this.TEMP = this.START / this.TEMP;
        }

        this.roundCheck(this.TEMP);
        this.addBool = false;
        this.subBool = false;
        this.mulBool = false;
        this.divBool = false;
        this.justSolved = true;
    }

    public void solveMethodEquals(double d) {
        if (this.addBool) {
            this.SolveTEMP += this.TEMP;
        } else if (this.subBool) {
            this.SolveTEMP = this.TEMP - this.SolveTEMP;
        } else if (this.mulBool) {
            this.SolveTEMP = this.TEMP * this.SolveTEMP;
        } else if (this.divBool) {
            this.SolveTEMP = this.TEMP / this.SolveTEMP;
        }

        this.roundCheck(this.SolveTEMP);
        this.addBool = false;
        this.subBool = false;
        this.mulBool = false;
        this.divBool = false;
        this.operatorClicked = false;
        this.justSolved = true;
    }

    public void roundCheck(double d) {
        if (d % 1.0 == 0.0) {
            int result = (int)d;
            Integer iresult = result;
            this.jtfResult.setText(Integer.toString(iresult));
        } else {
            this.jtfResult.setText(Double.toString(d));
        }

    }

    class ListenToButton implements ActionListener {
        ListenToButton() {
        }

        public void actionPerformed(ActionEvent e) {
            Calculator.this.display = Calculator.this.jtfResult.getText();
            JButton button = (JButton)e.getSource();
            String buttonLabel = button.getText();
            if (Calculator.this.justSolved) {
                Calculator.this.justSolved = false;
                Calculator.this.jtfResult.setText(buttonLabel);
                Calculator.this.operatorClicked = false;
            } else if (Calculator.this.operatorClicked) {
                Calculator.this.jtfResult.setText(buttonLabel);
                Calculator.this.operatorClicked = false;
            } else if (Calculator.this.display.equals("0")) {
                Calculator.this.jtfResult.setText(buttonLabel);
            } else {
                Calculator.this.jtfResult.setText(Calculator.this.display + buttonLabel);
            }

        }
    }

    class ListenToAdd implements ActionListener {
        ListenToAdd() {
        }

        public void actionPerformed(ActionEvent e) {
            Calculator.this.TEMP = Double.parseDouble(Calculator.this.jtfResult.getText());
            Calculator.this.solveMethod(Calculator.this.TEMP);
            Calculator.this.START = Calculator.this.TEMP;
            Calculator.this.addBool = true;
            Calculator.this.operatorClicked = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        ListenToSubtract() {
        }

        public void actionPerformed(ActionEvent e) {
            Calculator.this.TEMP = Double.parseDouble(Calculator.this.jtfResult.getText());
            Calculator.this.solveMethod(Calculator.this.TEMP);
            Calculator.this.START = Calculator.this.TEMP;
            Calculator.this.subBool = true;
            Calculator.this.operatorClicked = true;
        }
    }

    class ListenToMultiply implements ActionListener {
        ListenToMultiply() {
        }

        public void actionPerformed(ActionEvent e) {
            Calculator.this.TEMP = Double.parseDouble(Calculator.this.jtfResult.getText());
            Calculator.this.solveMethod(Calculator.this.TEMP);
            Calculator.this.START = Calculator.this.TEMP;
            Calculator.this.mulBool = true;
            Calculator.this.operatorClicked = true;
        }
    }

    class ListenToDivide implements ActionListener {
        ListenToDivide() {
        }

        public void actionPerformed(ActionEvent e) {
            Calculator.this.TEMP = Double.parseDouble(Calculator.this.jtfResult.getText());
            Calculator.this.solveMethod(Calculator.this.TEMP);
            Calculator.this.START = Calculator.this.TEMP;
            Calculator.this.divBool = true;
            Calculator.this.operatorClicked = true;
        }
    }

    class ListenToSolve implements ActionListener {
        ListenToSolve() {
        }

        public void actionPerformed(ActionEvent e) {
            Calculator.this.SolveTEMP = Double.parseDouble(Calculator.this.jtfResult.getText());
            Calculator.this.solveMethodEquals(Calculator.this.SolveTEMP);
        }
    }

    class ListenToClear implements ActionListener {
        ListenToClear() {
        }

        public void actionPerformed(ActionEvent e) {
            Calculator.this.jtfResult.setText("0");
            Calculator.this.addBool = false;
            Calculator.this.subBool = false;
            Calculator.this.mulBool = false;
            Calculator.this.divBool = false;
            Calculator.this.operatorClicked = false;
            Calculator.this.justSolved = false;
            Calculator.this.START = 0.0;
            Calculator.this.TEMP = 0.0;
            Calculator.this.SolveTEMP = 0.0;
        }
    }
}
