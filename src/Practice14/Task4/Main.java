package Practice14.Task4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(\\d\\s\\+)");
        Matcher m1 = p1.matcher(str);
        boolean a = false;
        while (m1.find())
        {
            a = true;
        }
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
