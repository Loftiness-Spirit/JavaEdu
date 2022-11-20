package Practice18.Task3;

import java.util.Scanner;
/*
С помощью перехватывания исключений можно оказывать влияние
на поведение программы. В вашем решении в предыдущем упражнении
!!!! вы можете добавить новый пункт - catch в начале списка пунктов catch!!!!
Шаг 1. Выполите это действие, чтобы поймать общее исключение
класса Exception.
Шаг 2. Перезапустите программу с приведенными выше данными и
обратите внимание на ее поведение.
Объясните новое поведение программы
 */
public class Exception2 {
//    public void exceptionDemo() {
//        try {
//            Scanner myScanner = new Scanner(System.in);
//            System.out.print("Enter an integer ");
//            String intString = myScanner.next();
//            int i = Integer.parseInt(intString);
//            System.out.println(2 / i);
//        }
//        catch (Exception e){
//            System.out.println("Общее исключение");
//        }
//        catch (NumberFormatException e){
//            System.out.println("Неверный формат ввода");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Попытка разделить на ноль");
//        }
//    }
}
/*
Новое поведение программы:
    Не компилируется
Объяснение:
    Т.к мы добавляем новый пункт - catch в начале списка пунктов catch,
    и он ловит общее исключение, следующие блоки catch ничего не ловят,
    т.к их исключения уже пойманы как общие, что вызвает исключения:
    C:\Users\krylo\IdeaProjects\JavaEdu\src\Practice18\Task3\Exception3.java:26:9
    java: exception java.lang.NumberFormatException has already been caught
    C:\Users\krylo\IdeaProjects\JavaEdu\src\Practice18\Task3\Exception3.java:29:9
    java: exception java.lang.ArithmeticException has already been caught

*/
