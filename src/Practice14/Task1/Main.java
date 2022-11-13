package Practice14.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] res;
        res = s.split("[,\\s]+");
        for (String i : res){
            System.out.println(i);
        }
    }

}
