package Practice27.Task2;

public class Main {
    public static void main(String[] args)
    {
        Map map = new Map();
        map.Add("Крылов","Алесандр");
        map.Add("Иванов","Иван");
        map.Add("Петров","Иван");
        map.Add("Олбутов","Дима");
        map.Add("Петров","Петр");

        map.Add("Крылов","Алесандр");
        map.Add("Иванов","Иван");
        map.Add("Петров","Иван");
        map.Add("Олбутов","Дима");
        map.Add("Петров","Петр");
        System.out.println(map.getSameFirstNameCount());
        System.out.println(map.getSameLastNameCount());
        map.CreateMap();
    }
}
