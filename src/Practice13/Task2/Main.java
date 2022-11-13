package Practice13.Task2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Крылов");
        System.out.println(person);
        person.setName("Александр");
        person.setLastName("Николаевич");
        System.out.println(person);
    }
}
