package Practice8.Task17;

import java.util.Scanner;

public class Main {
    public static int maxF(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num==0)
            return 0;
        else
            return Math.max(num,maxF());
    }

    public static void main(String[] args) {
        System.out.println(maxF());
    }
}
