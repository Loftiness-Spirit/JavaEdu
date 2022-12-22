package Practice6.Task6.Task7.Task8.Task9;

public class Book implements Printable{
    private String name;
    private String author;
    public Book(String name, String author){
        this.name=name;
        this.author=author;
    }
    public void print(){
        System.out.println("Book: "+this.name+" Author: "+this.author);
    }
}
