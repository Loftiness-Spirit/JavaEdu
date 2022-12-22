package Practice6.Task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Convertable temperature = new Temperature();
        System.out.println("Конвертатор температур:");
        System.out.println("1. По Цельсию -> по Кельвину");
        System.out.println("2. По Цельсию -> по Фаренгейту");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Введите температуру: ");
                System.out.println("По Кельвину: " + temperature.convert(scanner.nextDouble(),1));
                break;
            case 2:
                System.out.println("Введите температуру: ");
                System.out.println("По Фаренгейту: " + temperature.convert(scanner.nextDouble(),2));
                break;
        }
    }
}
