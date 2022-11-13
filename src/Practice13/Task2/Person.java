package Practice13.Task2;

public class Person {
    private String name="-";
    private String surName;
    private String lastName="-";

    public Person (String surName){
        this.surName=surName;
    }
    public Person (String surName, String name, String lastName){
        this.surName = surName;
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return surName+" "+name.charAt(0)+"."+lastName.charAt(0)+".";
    }
}
