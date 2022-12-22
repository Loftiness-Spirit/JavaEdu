package Practice7.Task4;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        System.out.println(mc.pow(2,0));
        System.out.println(mc.pow(2,2));
        System.out.println(mc.pow(2,-2));
        System.out.println(mc.abs(4,3));
        System.out.println("Длина окружности с радиусом 3: "+(2*mc.PI()*3));
    }
}
