package Practice19;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Крылов Александр Николаевич", 100, 1, 18));
        s.add(new Student("Иванов Иван Иванович", 63, 12, 17));
        s.add(new Student("Петров Петр Петрович", 93, 16, 20));
        s.add(new Student("Александр Александров Александрович", 24, 2, 18));

        new LabClassUI(s);
    }

}
