package Practice14.Task3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(\\d+(\\.\\d+)?\\s((USD)|(EUR)|(RUB)))+");
        Matcher m1 = p1.matcher(str);
        String ans = new String();
            while(m1.find())
                ans=ans+m1.group()+" ";

        System.out.println(ans);
    }
}
