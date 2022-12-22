package Practice8.Task16;

import java.util.Scanner;

public class Main {
    public static void maxF(int max, int counter){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num>0){
            if(num>max)
                maxF(num,1);

            else if(num==max)
                maxF(max,++counter);

            else
                maxF(max,counter);
        }
        else
            System.out.println(counter);
    }

    public static void main(String[] args) {
        maxF(0,0);
    }
}
