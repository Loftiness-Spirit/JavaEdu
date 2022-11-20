package Practice17.Task2;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }
    public String getEmployeeName(){
        return model.getName();
    }
    public void setEmployeeName(String name){
        model.setName(name);
    }
    public int getEmployeeWorkHours(){
        return model.getWorkHours();
    }
    public void setEmployeeWorkHours(int workHours){
        model.setWorkHours(workHours);
    }
    public int getEmployeePosition(){
        return model.getPosition();
    }
    public void setEmployeePosition(int position){
        model.setPosition(position);
    }
    public int getEmployeeWage(){
        return model.getWage();
    }
    public void setEmployeeWage(){
        model.setWage();
    }
    public void updateView(){
        setEmployeeWage();
        view.printEmployeeDetails(model.getName(), model.getWorkHours(), model.getPosition(), model.getWage());
    }
}
