package Practice17.Task2;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee model = retrieveCourseFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model,view);
        controller.updateView();
        controller.setEmployeeWorkHours(55);
        controller.updateView();
        controller.setEmployeePosition(3);
        controller.updateView();
    }

    private static Employee retrieveCourseFromDatabase() {
        Employee employee = new Employee();
        employee.setName("Jonds");
        employee.setWorkHours(40);
        employee.setPosition(2);
        employee.setWage();
        return employee;
    }
}
