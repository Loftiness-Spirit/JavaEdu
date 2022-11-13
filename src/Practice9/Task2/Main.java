package Practice9.Task2;


public class Main {
    public static void main(String[] args) {
        SortingStudentsByGPA A = new SortingStudentsByGPA(10);
        System.out.println(A);
        A.quickSort(0,9);
        System.out.println(A);
    }
}
