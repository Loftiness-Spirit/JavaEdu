package Practice6.Task6.Task7.Task8.Task9;

public class Shop implements Printable{
    Printable[] A;
    Shop(String name1, String author1, String name2, String author2, String name3, String author3){
        A = new Printable[3];
        A[0] = new Book(name1,author1);
        A[1] = new Book(name2,author2);
        A[2] = new Book(name3,author3);
    }

    @Override
    public void print() {
        for (int i=0;i<3;i++){
            A[i].print();
        }
    }
}
