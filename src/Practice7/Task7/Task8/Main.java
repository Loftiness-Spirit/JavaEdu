package Practice7.Task7.Task8;

public class Main {
    public static void main(String[] args) {
        Printable[] shop = new Printable[8];
        shop[0] = new Book("Book-name1");
        shop[1] = new Magazine("Magazine-name1");
        shop[2] = new Book("Book-name2");
        shop[3] = new Magazine("Magazine-name2");
        shop[4] = new Book("Book-name3");
        shop[5] = new Magazine("Magazine-name3");
        shop[6] = new Book("Book-name4");
        shop[7] = new Magazine("Magazine-name4");
        Magazine.printMagazines(shop);
        Book.printBooks(shop);
    }
}
