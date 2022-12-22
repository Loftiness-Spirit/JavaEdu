package Practice3.MathRand.Task2;

public class Tester {
    private int n;
    private Circle [] a;
    private Circle max=new Circle();
    private Circle min=new Circle();

    Tester(int num){
        this.n=num;
        this.a=new Circle[n];
    }
    public void setN(int n) {
        this.n = n;
    }
    public void buildARandLength(){
        for(int i=0;i<a.length;i++){
            a[i]=new Circle();
            a[i].setX();
            a[i].setY();
            a[i].setRandLength();
            a[i].setRadius();
        }
    }
    public void buildARandRadius(){
        for(int i=0;i<a.length;i++){
            a[i]=new Circle();
            a[i].setX();
            a[i].setY();
            a[i].setRandRadius();
            a[i].setLength();
        }
    }

    public void getMax(){
        max.radius=0;
        for(int i=0;i<a.length;i++){
            if(a[i].radius>max.radius)
                max.radius=a[i].radius;
        }
        for(int i=0;i<a.length;i++){
            if(a[i].radius==max.radius)
                max=a[i];
        }
    }
    public void getMin(){
        min.radius=1000;
        for(int i=0;i<a.length;i++){
            if(a[i].radius<min.radius)
                min.radius=a[i].radius;
        }
        for(int i=0;i<a.length;i++){
            if(a[i].radius==min.radius)
                min=a[i];
        }
    }
    public void sort(){
        boolean sorted=false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i].radius > a[i + 1].radius) {
                    Circle temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    sorted=false;
                }
            }
        }
    }
    public void out(){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i].radius);
        }
    }

    public static void main(String[] args) {
        Tester a = new Tester(10);
        a.buildARandRadius();
        a.out();
        a.getMax();
        a.getMin();
        System.out.println("Самая большая окружность с радиусом: "+a.max.radius);
        System.out.println("Самая маленькая окружность с радиусом: "+a.min.radius);
        a.sort();
        a.out();
    }
}
