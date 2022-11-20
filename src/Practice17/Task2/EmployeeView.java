package Practice17.Task2;

import java.text.NumberFormat;

public class EmployeeView {
    public void printEmployeeDetails(String name, int workHours, int position, int wage){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("Employee details: ");
        System.out.println("Name: "+name);
        System.out.println("Working hours: "+workHours+"h");
        System.out.println("ID of position in company: "+ position);
        System.out.println("Wage: "+nf.format(wage));
    }
}
