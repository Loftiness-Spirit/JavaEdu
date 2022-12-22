package Practice27.Task2;

public class Main {
    public static void main(String[] args)
    {
        Map map = new Map();
        map.Add("Крылов","Алесандр");
        map.Add("Иванов","Иван");
        map.Add("Петров","Иван");
        map.Add("Олбутов","Дима");
        map.Add("Дубов","Петр");

        map.Add("Крылов","Алесандр");
        map.Add("Кашин","Олег");
        map.Add("Мандаринов","Никита");
        map.Add("Стеклов","Женя");
        map.Add("Яблочников","Костя");
        System.out.println(map.getSameFirstNameCount());
        System.out.println(map.getSameLastNameCount());
        map.CreateMap();
    }
}
