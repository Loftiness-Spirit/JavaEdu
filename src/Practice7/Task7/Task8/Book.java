package Practice7.Task7.Task8;

public class Book implements Printable{
    private String name;
    public Book(){}
    public Book(String name){
        this.name=name;
    }
    public static void printBooks(Printable[] printable){
        for (int i = 0; i < printable.length; ++i)
        {
            if(printable[i] instanceof Book)
            {
                System.out.println(printable[i].print());
            }
        }
    }
    @Override
    public String print() {
        return name;
    }
}
