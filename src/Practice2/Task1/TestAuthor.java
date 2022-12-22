package Practice2.Task1;

public class TestAuthor {
    public static void main (String[] args){
        Author a1=new Author("Ivan Popov", "ivan@somewhere.com",'m');
        System.out.println(a1);
        a1.setEmail("ivPopov@somewhere.com");
        System.out.println(a1);
    }
}
