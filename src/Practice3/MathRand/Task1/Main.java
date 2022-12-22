package Practice3.MathRand.Task1;

import java.util.Random;

public class Main {
    public static void sort (double[] a){
        double temp;
        boolean sorted=false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
    public static void out(double[] a){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        Random rand=new Random();
        double []b = new double[10];
        for (int i=0;i<b.length;i++){
            if(i%2==0)
                b[i]=Math.random();
            else b[i]=rand.nextDouble();
        }
        sort(b);
        out(b);

    }
}
