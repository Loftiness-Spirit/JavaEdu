package Practice10.Task1.Task2.Task3;

public class Student {
    private String name;
    private String surname;
    private String Specialization;
    private short group;
    private byte course;
    private double score;
    public Student(){}
    public Student(Student a){
        this.name=a.name;
        this.surname=a.surname;
        this.Specialization=a.Specialization;
        this.group=a.group;
        this.course=a.course;
        this.score=a.score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public short getGroup() {
        return group;
    }

    public void setGroup(short group) {
        this.group = group;
    }

    public byte getCourse() {
        return course;
    }

    public void setCourse(byte course) {
        this.course = course;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student: "+this.name+" "+this.surname+"\nSpecialization: "+this.Specialization+"\nGroup: "+this.group+"\nCourse: "+this.course+"\nScore: "+this.score+"\n";
    }
}
