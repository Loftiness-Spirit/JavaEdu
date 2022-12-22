package Practice10.Task1.Task2.Task3;

public class Main {
    public static void main(String[] args) {
       SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
       sortingStudentsByGPA.setArray(4);
       sortingStudentsByGPA.outArray();
       sortingStudentsByGPA.quicksortScore();
       sortingStudentsByGPA.outArray();
       sortingStudentsByGPA.quicksortCourse();
       sortingStudentsByGPA.outArray();
       sortingStudentsByGPA.quicksortGroup();
       sortingStudentsByGPA.outArray();
       SortingStudentsByGPA sortingStudentsByGPA1 = new SortingStudentsByGPA();
       sortingStudentsByGPA1.setArray(3);
       sortingStudentsByGPA1.outArray();
       SortingStudentsByGPA sortingStudentsByGPA2 = new SortingStudentsByGPA();
       sortingStudentsByGPA2.Add(sortingStudentsByGPA,sortingStudentsByGPA1);
       sortingStudentsByGPA2.outArray();
    }
}