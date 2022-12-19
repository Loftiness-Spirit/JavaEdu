package Practice31;

public final class Drink extends MenuItem implements Alcoholable {

    double alcoholVol;
    DrinkTypeEnum type;

    public Drink(String name, String description, DrinkTypeEnum type){
        super(name, description);
        this.type = type;
        alcoholVol = switch (type){
            case BEER -> 5.0;
            case WINE -> 11.0;
            case VODKA, WHISKEY, RUM -> 40.0;
            case BRANDY -> 37.5;
            case CHAMPAGNE -> 11.5;
            case TEQUILA -> 38.0;
            case VERMUTH -> 14.0;
            case LIQUOR -> 23.0;
            case JAGERMEISTER -> 35.0;
            default -> 0.0;
        };
    }
    public Drink(int cost, String name, String description, DrinkTypeEnum type){
        super(cost, name, description);
        this.type = type;
        alcoholVol = switch (type){
            case BEER -> 5.0;
            case WINE -> 11.0;
            case VODKA, WHISKEY, RUM -> 40.0;
            case BRANDY -> 37.5;
            case CHAMPAGNE -> 11.5;
            case TEQUILA -> 38.0;
            case VERMUTH -> 14.0;
            case LIQUOR -> 23.0;
            case JAGERMEISTER -> 35.0;
            default -> 0.0;
        };
    }

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
            if(alcoholVol!=0.0)
                return true;
            else return false;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
