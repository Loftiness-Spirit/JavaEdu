package Practice32;

public final class Dish extends MenuItem {

    public Dish(String name, String description){
        super(name, description);
    }
    public Dish(int cost, String name, String description){
        super(cost, name, description);
    }
    public String fileString()
    {
        return "Dish '" + this.name + "' " + this.cost + " '" + this.description + "'";
    }
}
