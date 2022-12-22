package Practice29;

public class Main {
    public static void main(String[] args)
    {
        Item[] item = new Item[6];
        item[0] = new Drink(600, "A", "123");
        item[1] = new Drink(500, "B", "123");
        item[2] = new Drink(400, "C", "123");
        item[3] = new Dish(300, "D", "123");
        item[4] = new Dish(200, "E", "123");
        item[5] = new Dish(100, "F", "123");
        List list = new List();
        list.add(item[0]);
        list.add(item[1]);
        list.add(item[2]);
        list.add(item[3]);
        list.add(item[4]);
        list.add(item[5]);
        list.traverseList();
        System.out.println(list.Search("A"));
        System.out.println(list.delete("A"));
        System.out.println(list.delete("A"));
        list.traverseList();
        System.out.println("\n" + list.Search("A"));

        Order A = new InternetOrder();
        A.add(item[0]);
        A.add(item[1]);
        A.add(item[2]);
        A.add(item[3]);
        A.add(item[4]);
        A.add(item[5]);
        A.add(item[4]);
        A.add(item[4]);
        System.out.println(A.searchAll());
        String[] B = A.arrayString();
        for (int i = 0; i < B.length; ++i)
        {
            System.out.println(B[i]);
        }
        List C = A.arrayCost();
        for (int i = 0; i < C.traverseKolVo(); ++i)
        {
            System.out.println(C.Search(i));
        }
    }
}
