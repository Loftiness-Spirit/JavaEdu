package Practice29;

public final class  Drink implements Item{
    private double price;
    private String name;
    private String description;
    public Drink(String name, String description){
        this.price = 0;
        this.name = name;
        this.description = description;
    }
    public Drink(double price, String name, String description){
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
