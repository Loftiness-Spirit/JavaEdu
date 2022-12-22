package Practice3.MathRand.Task3;

import java.util.Random;

public class Sequence {
    public static void main(String[] args) {
        int [] a=new int [4];
        Random rand=new Random();
        boolean is=false;
        for (int i=0;i<4;i++) {
            a[i]=rand.nextInt((99 - 10) + 1) + 10;
            System.out.println(a[i]);
        }
        for (int i=0;i<3;i++) {
            if(a[i]>a[i+1]){
                System.out.println("Не является");
                is=false;
                break;
            }
            else
                is=true;
        }
        if(is)
            System.out.println("Является");
    }
}
