package Practice9.Task2;

import Practice9.Task1.Student;

public class SortingStudentsByGPA implements Comparator{
    private Student[] students;
    private int n;
    public int getLeft(){
        return students[0].getScore();
    }
    public int getRight(){
        return students[n-1].getScore();
    }
    public SortingStudentsByGPA(int n){
        this.n=n;
        students=new Student[n];
        for (int i = 0; i < n; i++){
            students[i]=new Student();
        }
    }

    @Override
    public String toString() {
        String out = "";
        for(int i = 0; i<n;i++) {
            out+=("n: "+i+" idNumber: "+this.students[i].getiDNumber()+" score: "+this.students[i].getScore()+"\n");
        }
        return out;
    }

    @Override
    public int compare(int a, int b) {
        return a-b;
    }
    @Override
    public void quickSort(int leftBorder, int rightBorder) {
        if (n == 0)
        {
            return;
        }
        if (leftBorder >= rightBorder)
        {
            return;
        }
        int middle = leftBorder +(rightBorder - leftBorder)/2;
        Student student = students[middle];
        int i = leftBorder, j = rightBorder;
        while (i <= j)
        {
            while (compare(students[i].getScore(),student.getScore())>0)
            {
                i++;
            }
            while (compare(students[j].getScore(),student.getScore()) <0)
            {
                j--;
            }
            if (i <= j)
            {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
            if ( leftBorder < j )
            {
                quickSort(leftBorder,j);
            }
            if (rightBorder > i )
            {
                quickSort(i,rightBorder);
            }
        }
    }
}
