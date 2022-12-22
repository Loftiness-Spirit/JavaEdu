package Practice30;

public class MenuItem {
    private int cost;
    private String name;
    private String description;

    public MenuItem(String name, String description) throws IllegalArgumentException{
        if (name.isEmpty() == true)
        {
            throw new RuntimeException("Ошибка! Пустая строка!");
        }
        if (description.isEmpty() == true)
        {
            throw new RuntimeException("Ошибка! Пустая строка!");
        }
        this.cost = 0;
        this.name = name;
        this.description = description;
    }
    public MenuItem(int cost, String name, String description)throws IllegalArgumentException{
        if (cost <= 0)
        {
            throw new RuntimeException("Ошибка! Стоимость не может быть равна или меньше 0!");
        }
        if (name.isEmpty())
        {
            throw new RuntimeException("Ошибка! Пустая строка!");
        }
        if (description.isEmpty())
        {
            throw new RuntimeException("Ошибка! Пустая строка!");
        }
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Название: " + name + "\nЦена: " + cost+ "\nОписание: " + description;
    }
}
