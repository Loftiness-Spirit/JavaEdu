package Practice3.MathRand.Task4;

import java.util.Random;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n=scanner.nextInt();
        while(n<0){
            System.out.println("Некорректный ввод. Повторите.");
            n=scanner.nextInt();
        }
        int []a=new int[n];
        int []b=new int[n];
        int j=0;
        Random rand= new Random();
        System.out.println("Массив:");
        for (int i=0;i<n;i++){
            a[i]=rand.nextInt(n);
            System.out.println(a[i]);
            if (a[i]%2==0){
                b[j]=a[i];
                j++;
            }
        }
        System.out.println("Массив четных:");
        for(int i=0;i<j;i++)
            System.out.println(b[i]);
    }
}
