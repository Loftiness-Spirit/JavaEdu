package Practice9.Task3;

import Practice9.Task1.Student;

public class Test {
    private Student[] FirstList;
    private Student[] SecondList;
    private Student[] ResList;
    public Test(int a, int b){
        FirstList = new Student[a];
        for(int i = 0;i < a;i++){
            FirstList[i]=new Student();
        }
        SecondList = new Student[b];
        for(int i = 0;i < b;i++){
            SecondList[i]=new Student();
        }
    }


    public String toStringFirstList() {
        String out = "";
        for(int i = 0; i<this.FirstList.length;i++) {
            out+=("n: "+i+" idNumber: "+this.FirstList[i].getiDNumber()+" score: "+this.FirstList[i].getScore()+"\n");
        }
        return out;
    }
    public String toStringSecondList() {
        String out = "";
        for(int i = 0; i<this.SecondList.length;i++) {
            out+=("n: "+i+" idNumber: "+this.SecondList[i].getiDNumber()+" score: "+this.SecondList[i].getScore()+"\n");
        }
        return out;
    }
    public String toStringResList() {
        String out = "";
        for(int i = 0; i<this.ResList.length;i++) {
            out+=("n: "+i+" idNumber: "+this.ResList[i].getiDNumber()+" score: "+this.ResList[i].getScore()+"\n");
        }
        return out;
    }
    public void buildResList(){
        ResList = new Student[FirstList.length+ SecondList.length];
        for(int i = 0;i< FirstList.length;i++){
            ResList[i]=new Student(FirstList[i]);
        }
        for(int i = FirstList.length;i< ResList.length;i++){
            ResList[i]=new Student(SecondList[i-FirstList.length]);
        }
        int[] sorted = new int[ResList.length];
        for(int i = 0; i < ResList.length;i++){
            sorted[i] = ResList[i].getiDNumber();
        }
        mergeSort(sorted,ResList.length);
        for(int i = 0; i< ResList.length; i++){
            ResList[i].setiDNumber(sorted[i]);
        }


    }
    public void mergeSort(int [] arr, int n){
        if (n < 2) {
            return;
        }
        int mid = n/2;
        int[] l = new int [mid];
        int [] r = new int [n-mid];
        for(int  i = 0;i<mid;i++){
            l[i]=arr[i];
        }
        for(int i = mid;i<n;i++){
            r[i-mid] = arr[i];
        }
        mergeSort(l,mid);
        mergeSort(r,n-mid);
        merge(arr, l, r, mid, n-mid);
    }
    public void merge(int[] arr, int[] l, int[] r, int left, int right){
        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
        {
            if (l[i] <= r[j])
            {
                arr[k++] = l[i++];
            }
            else
            {
                arr[k++] = r[j++];
            }
        }
        while (i < left)
        {
            arr[k++] = l[i++];
        }
        while (j < right)
        {
            arr[k++] = r[j++];
        }
    }
}
