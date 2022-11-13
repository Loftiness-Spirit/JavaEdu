package Practice11.Task3;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        System.out.println("1) Обычный формат");
        System.out.println("2) Расширенный формат");
        int x = scanner.nextInt();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String A = "";
        switch (x)
        {
            case 2:
            {
                A+=year+"/"+month+"/"+day+"\n";
            }
            case 1:
            {
                A+=hour+":"+minute+":"+second+"\n";
            }
            default:{}
        }
        System.out.println(A);
    }
}
