package Practice32;

public class MenuItem {
    protected int cost;
    protected String name;
    protected String description;

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
    public String fileString()
    {
        return "MenuItem " + this.cost + " '" + this.name + "'";
    }
    @Override
    public String toString() {
        return "Название: " + name + "\nЦена: " + cost+ "\nОписание: " + description;
    }
}
