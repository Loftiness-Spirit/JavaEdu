package Practice25.Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(((2[0-5][0-5])|(1[0-9][0-9])|([0-9][0-9])|[0-9])(.((2[0-5][0-5])|(1[0-9][0-9])|([0-9][0-9])|[0-9])){3}\\s*)+");
        Matcher m1 = p1.matcher(str);
        boolean a = m1.matches();
        if (a)
        {
            System.out.println(str);
        }
        else
        {
            System.out.println("false");
        }
    }
}
