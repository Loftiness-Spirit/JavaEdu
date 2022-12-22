package Practice4_1.Task4;

public class Main {
    public static void main(String[] args) {
        Matrix a= new Matrix(4,4);
        a.setMatrix();
        System.out.println("First matrix");
        a.out();
        Matrix b= new Matrix(4,4);
        b.setMatrix();
        System.out.println("Second matrix");
        b.out();
        Matrix sum=new Matrix();
        sum.sum(a,b);
        System.out.println("Sum matrix");
        sum.out();
        a.multi(2);
        System.out.println("Multiplication matrix");
        a.out();
    }
}
