package Practice9.Task1;

public class Test {
    private Student[] students;
    private int n;
    public Test(int n){
        this.n=n;
        students = new Student[n];
        for(int i = 0; i<n;i++){
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
    public void iDSort(){
        for (int i = 0;i<n;i++){
            int val = students[i].getiDNumber();
            int j=i-1;
            for(;j>=0;j--){
                if (val <students[j].getiDNumber()){
                    students[j+1].setiDNumber((students[j].getiDNumber()));
                }
                else break;
            }
            students[j+1].setiDNumber(val);
        }
    }
}
