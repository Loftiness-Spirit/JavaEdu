package Practice30;

import java.util.Scanner;

public enum DrinkTypeEnum {
    BEER,
    WINE,
    VODKA,
    BRANDY,
    CHAMPAGNE,
    WHISKEY,
    TEQUILA,
    RUM,
    VERMUTH,
    LIQUOR,
    JAGERMEISTER,
    JUICE,
    COFFEE,
    GREEN_TEA,
    BLACK_TEA,
    MILK,
    WATER,
    SODA;

    public static DrinkTypeEnum menu(int age){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбор типа напитка: ");
        if(age>=18) {
            System.out.println("1. Пиво");
            System.out.println("2. Вино");
            System.out.println("3. Водка");
            System.out.println("4. Бренди");
            System.out.println("5. Шампанское");
            System.out.println("6. Виски");
            System.out.println("7. Текила");
            System.out.println("8. Ром");
            System.out.println("9. Вермут");
            System.out.println("10. Ликер");
            System.out.println("11. Егермейстер");
            System.out.println("12. Сок");
            System.out.println("13. Кофе");
            System.out.println("14. Зеленый чай");
            System.out.println("15. Черный чай");
            System.out.println("16. Молоко");
            System.out.println("17. Вода");
            System.out.println("18. Содовая");
            return switch (scanner.nextInt()){
                case 1 -> BEER;
                case 2 -> WINE;
                case 3 -> VODKA;
                case 4 -> BRANDY;
                case 5 -> CHAMPAGNE;
                case 6 -> WHISKEY;
                case 7 -> TEQUILA;
                case 8 -> RUM;
                case 9 -> VERMUTH;
                case 10 -> LIQUOR;
                case 11 -> JAGERMEISTER;
                case 12 -> JUICE;
                case 13 -> COFFEE;
                case 14 -> GREEN_TEA;
                case 15 -> BLACK_TEA;
                case 16 -> MILK;
                case 17 -> WATER;
                case 18 -> SODA;
                default -> null;
            };
        }
        else {
            System.out.println("1. Сок");
            System.out.println("2. Кофе");
            System.out.println("3. Зеленый чай");
            System.out.println("4. Черный чай");
            System.out.println("5. Молоко");
            System.out.println("6. Вода");
            System.out.println("7. Содовая");
            return switch (scanner.nextInt()){
                case 1 -> JUICE;
                case 2 -> COFFEE;
                case 3 -> GREEN_TEA;
                case 4 -> BLACK_TEA;
                case 5 -> MILK;
                case 6 -> WATER;
                case 7 -> SODA;
                default -> null;
            };
        }
    }
}
