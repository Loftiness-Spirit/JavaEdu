package Practice11.Task5;

import Practice9.Task2.SortingStudentsByGPA;

import java.util.Date;

public class Main {
    public static void main(String[] args)
    {
        SortingStudentsByGPA A = new SortingStudentsByGPA(500);
        System.out.println(A);
        Date date1 = new Date();
        A.quickSort(0, 499);
        Date date2 = new Date();
        System.out.println(A);
        System.out.printf("First time: %d\n", date2.getSeconds() - date1.getSeconds());
        SortingStudentsByGPA B = new SortingStudentsByGPA(400);
        System.out.println(B);
        Date date3 = new Date();
        B.quickSort(0, 399);
        Date date4 = new Date();
        System.out.println(B);

        System.out.printf("Second time: %d\n",date4.getSeconds() - date3.getSeconds());
        System.out.printf("Difference time: %d\n",date2.getSeconds() - date1.getSeconds()-date4.getSeconds()+date3.getSeconds());
    }
}
