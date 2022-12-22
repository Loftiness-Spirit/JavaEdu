package Practice7.Task7.Task8;

public class Magazine implements Printable{
    private String name;
    public Magazine(){}
    public Magazine(String name){
        this.name=name;
    }
    public static void printMagazines(Printable[] printable){
        for (int i = 0; i < printable.length; ++i)
        {
            if(printable[i] instanceof Magazine)
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
