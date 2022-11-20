package Practice17.Task2;

public class Employee {
    private String name;
    private int workHours;
    private int position;
    private int wage;

    public Employee(){
        name = "Enigma";
        workHours = 40;
        position = 1;
        wage = 40000;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(){
        int rate = position * 1000;
        this.wage = workHours * rate;
    }

}
