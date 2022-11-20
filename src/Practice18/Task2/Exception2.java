package Practice18.Task2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e){
            System.out.println("Неверный формат ввода");
        }
        catch (ArithmeticException e){
            System.out.println("Попытка разделить на ноль");
        }
    }
}

/*
INPUT: Qwerty
    Exception in thread "main" java.lang.NumberFormatException: For input string: "Qwerty"
	    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	    at java.base/java.lang.Integer.parseInt(Integer.java:665)
	    at java.base/java.lang.Integer.parseInt(Integer.java:781)
	    at Practice18.Task2.Exception2.exceptionDemo(Exception2.java:10)
	    at Practice18.Task2.Main.main(Main.java:8)
*/
/*
INPUT: 0
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at Practice18.Task2.Exception2.exceptionDemo(Exception2.java:11)
	    at Practice18.Task2.Main.main(Main.java:8)
*/
/*
INPUT: 1.2
    Exception in thread "main" java.lang.NumberFormatException: For input string: "1.2"
	    at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	    at java.base/java.lang.Integer.parseInt(Integer.java:665)
	    at java.base/java.lang.Integer.parseInt(Integer.java:781)
	    at Practice18.Task2.Exception2.exceptionDemo(Exception2.java:10)
	    at Practice18.Task2.Main.main(Main.java:8)
*/
/*
INPUT: 1
OUTPUT: 2
*/