package Practice9.Task1;

public class Student {
    private int iDNumber;

    private int score;

    public Student(){
        iDNumber=(int)(Math.random()*((1000)+1));
        score = (int) (Math.random() * ((100) + 1));
    }
    public Student(Student A)
    {
        this.iDNumber=A.getiDNumber();
        this.score=A.getScore();
    }
    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
