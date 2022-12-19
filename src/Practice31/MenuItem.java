package Practice31;

public class MenuItem {
    private int cost;
    private String name;
    private String description;

    public MenuItem(String name, String description){
        this.cost = 0;
        this.name = name;
        this.description = description;
    }
    public MenuItem(int cost, String name, String description){
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
