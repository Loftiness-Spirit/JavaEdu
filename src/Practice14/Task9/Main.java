package Practice14.Task9;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args)
    {
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p1 = Pattern.compile("(a|b|c|d|e|f|g|h|i)");
        Matcher m1 = p1.matcher(str);
        HashMap<String, Integer> map = new HashMap<>();
        while (m1.find())
        {
            if (map.containsKey(m1.group())) {
                map.put(m1.group(), map.get(m1.group()) + 1);
            } else {
                map.put(m1.group(), 1);
            }
        }
        System.out.println(map);
    }
}
