package Practice22.Task1;

import java.util.Scanner;
import java.util.Stack;

public class CalculatorRPN {
    private static Stack<Integer> stack = new Stack();
    private static Scanner input;

    public CalculatorRPN() {
    }

    public static void calculator() throws Exception {
        System.out.println("RPN калькулятор!");
        takeInput();
    }

    private static void takeInput() {
        String numOrOperand = " ";

        while(!numOrOperand.equals("x")) {
            System.out.print("Введите значение(число|*|/|+|-|=|w(вывод стека)|c): ");
            numOrOperand = input.next();

            try {
                int intNumOrOperand = Integer.valueOf(numOrOperand);
                stack.push(intNumOrOperand);
            } catch (Exception var3) {
                if (numOrOperand.equals("*")) {
                    stack.push((Integer)stack.pop() * (Integer)stack.pop());
                } else if (numOrOperand.equals("/")) {
                    stack.push((Integer)stack.pop() / (Integer)stack.pop());
                } else if (numOrOperand.equals("+")) {
                    stack.push((Integer)stack.pop() + (Integer)stack.pop());
                } else if (numOrOperand.equals("-")) {
                    stack.push((Integer)stack.pop() - (Integer)stack.pop());
                } else if (numOrOperand.equals("=")) {
                    System.out.println(stack.pop());
                } else {
                    int i;
                    if (numOrOperand.equals("c")) {
                        if (!stack.empty()) {
                            for(i = 0; i < stack.size(); ++i) {
                                stack.pop();
                            }
                        }
                    } else if (numOrOperand.equals("w")) {
                        for(i = 0; i < stack.size(); ++i) {
                            System.out.println(stack.get(i));
                        }
                    }
                }
            }
        }

    }

    static {
        input = new Scanner(System.in);
    }
}
