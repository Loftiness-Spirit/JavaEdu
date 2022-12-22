package Practice3.Shells.Task1;

public class Main {
    public static void main(String[] args) {
        Double d=Double.valueOf(1.123);
        System.out.println("Используя valueOf: "+d);
        Double d1=Double.parseDouble("1.123");
        System.out.println("Преобразование string в double "+d1);
        String d2=Double.toString(d1);
        System.out.println("Преобразование double в string "+d2);
        int i = (int)d1.doubleValue();
        System.out.println("Преобразование в int "+i);
        byte byt=(byte)d1.doubleValue();
        System.out.println("Преобразование в byte "+byt);
        long l=(long)d1.doubleValue();
        System.out.println("Преобразование в long "+l);
    }
}
