package Practice9.Task3;

public class Main {
    public static void main(String[] args) {
        Test test = new Test(6,6);
        System.out.println(test.toStringFirstList());
        System.out.println(test.toStringSecondList());
        test.buildResList();
        System.out.println(test.toStringResList());
    }
}
