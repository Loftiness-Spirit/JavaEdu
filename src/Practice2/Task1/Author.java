package Practice2.Task1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String s1, String s2, char c){
        name=s1;
        email=s2;
        gender=c;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + " (" + gender + ") at " + email ;
    }
}
