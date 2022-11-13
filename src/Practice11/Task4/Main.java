package Practice11.Task4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        Date data = new Date(year-1900,month-1,day,hour,minute);
        System.out.printf("%s %s %s %s %s%n", year,month,day,hour,minute);
        System.out.println(data);
    }
}
