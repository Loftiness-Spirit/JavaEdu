package Practice4.Task1;

public class Seasons {
    public enum Season {
        WINTER(-7), SPRING(22), SUMMER(10), FALL(8);
        private final int temperature;

        private Season(int temperature) {
            this.temperature = temperature;
        }

        public int getTemperature() {
            return this.temperature;
        }
    }

    public static void myFavourite(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case FALL:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
        }
    }

    public static void getDescription(Season season) {
        if (season == Season.SUMMER)
            System.out.println("Теплое время года");
        else System.out.println("Холодное время года");
    }

    public static void main(String[] args) {
        String favourite = Season.WINTER.toString();
        System.out.println(favourite);
        for (Season season : Season.values()) {
            System.out.println(season+" "+season.getTemperature());
            getDescription(season);
        }
    }
}
