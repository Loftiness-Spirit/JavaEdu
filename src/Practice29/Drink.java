package Practice29;

public final class Drink implements Item{
    private double price;
    private String name;
    private String description;
    public Drink(String name, String description){
        this.price = 0;
        this.name = name;
        this.description = description;
    }
    public Drink(double price, String name, String description)throws IllegalArgumentException {
        if (price <= 0)
        {
            throw new RuntimeException("Ошибка! Стоимость не может быть равна или меньше 0!");
        }
        if (name.isEmpty() == true)
        {
            throw new RuntimeException("Ошибка! Пустая строка!");
        }
        if (description.isEmpty() == true)
        {
            throw new RuntimeException("Ошибка! Пустая строка!");
        }
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
