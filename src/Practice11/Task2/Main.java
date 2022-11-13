package Practice11.Task2;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        int year1 = calendar.get(Calendar.YEAR);
        int year2 = scanner.nextInt();
        int month1 = calendar.get(Calendar.MONTH)+1;
        int month2 = scanner.nextInt();
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        int day2 = scanner.nextInt();
        int hour1 = calendar.get(Calendar.HOUR_OF_DAY);
        int hour2 = scanner.nextInt();
        int minute1 = calendar.get(Calendar.MINUTE);
        int minute2 = scanner.nextInt();
        int second1 = calendar.get(Calendar.SECOND);
        int second2 = scanner.nextInt();
        if (year1 == year2)
        {
            System.out.println("Года совпадают");
        }
        else
        {
            System.out.println("Года не совпадают");
        }

        if (month1 == month2)
        {
            System.out.println("Месяцы совпадают");
        }
        else
        {
            System.out.println("Месяцы не совпадают");
        }

        if (day1 == day2)
        {
            System.out.println("Дни совпадают");
        }
        else
        {
            System.out.println("Дни не совпадают");
        }

        if (hour1 == hour2)
        {
            System.out.println("Часы совпадают");
        }
        else
        {
            System.out.println("Часы не совпадают");
        }

        if (minute1 == minute2)
        {
            System.out.println("Минуты совпадают");
        }
        else
        {
            System.out.println("Минуты не совпадают");
        }

        if (second1 == second2)
        {
            System.out.println("Секунды совпадают");
        }
        else
        {
            System.out.println("Секунды не совпадают");
        }
    }
}
