package Practice8.Task15;

public class Main {
    public static void reverse(int num){
        if((num%10) != num)
        {
            System.out.println(num%10);
            reverse(num/10);
        }
        else
        {
            System.out.println(num%10);
        }
    }

    public static void main(String[] args) {
        reverse(12345);
    }
}
