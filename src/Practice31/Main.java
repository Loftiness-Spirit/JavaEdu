package Practice31;

import java.util.Scanner;

public class Main {
    private static Scanner str;
    private static Scanner num;
    private static Scanner dou;
    private static Scanner cha;

    public static Order Internet(){
        System.out.print("Введите возраст: ");
        int age = num.nextInt();
        System.out.println("Введите город: ");
        String city = str.nextLine();
        System.out.println("Введите почтовый индекс: ");
        int index = num.nextInt();
        System.out.println("Введите название улицы: ");
        String street = str.nextLine();
        System.out.println("Введите номер дома: ");
        int home = num.nextInt();
        System.out.println("Введите корпус дома(N - если корпус отсутствует): ");
        char homeL = cha.next().charAt(0);
        System.out.println("Введите номер квартиры: ");
        int homeK = num.nextInt();
        Address address = new Address(city, index, street, home, homeL, homeK);
        System.out.println(address);
        Order internetOrder = new InternetOrder(address);
        int option;

        MenuItem menuItem;
        boolean outerFlag = true;
        boolean innerFlag;
        while(outerFlag){
            System.out.println("Интернет-заказ:");
            System.out.println("1. Добавить блюдо в заказ");
            System.out.println("2. Добавить напиток в заказ");
            System.out.println("3. Удалить позицию из заказа");
            System.out.println("4. Создать заказ");
            System.out.println("5. Отменить заказ");
            System.out.println("6. Посмотреть позиции");
            option = num.nextInt();
            outerFlag = switch (option){
                case 1 -> {
                    System.out.print("Введите название: ");
                    String name = str.nextLine();
                    System.out.print("Введите описание: ");
                    String description = str.nextLine();
                    System.out.print("Введите цену: ");
                    int cost = num.nextInt();
                    innerFlag = internetOrder.add(new Dish(cost,name,description));
                    if(innerFlag){
                        System.out.println("Блюдо успешно добавлено");
                    }
                    else {
                        System.out.println("Ошибка! Блюдо не добавлено");
                    }
                    yield true;
                }
                case 2 -> {
                    DrinkTypeEnum type = DrinkTypeEnum.menu(age);
                    System.out.print("Введите название: ");
                    String name = str.nextLine();
                    System.out.print("Введите описание: ");
                    String description = str.nextLine();
                    System.out.print("Введите цену: ");
                    int cost = num.nextInt();
                    innerFlag = internetOrder.add(new Drink(cost,name,description, type));
                    if(innerFlag){
                        System.out.println("Напиток успешно добавлен");
                    }
                    else {
                        System.out.println("Ошибка! Напиток не добавлен");
                    }
                    yield true;
                }
                case 3 -> {
                    if(internetOrder.itemsQuantity()!=0){
                        System.out.println(internetOrder);
                        System.out.println("Введите название: ");
                        innerFlag = internetOrder.remove(str.nextLine());
                        if(innerFlag){
                            System.out.println("Позиция удалена");
                        }
                        else {
                            System.out.println("Ошибка! Позиция не удалена");
                        }
                    }
                    yield true;
                }
                case 4 -> false;
                case 6 -> {
                    System.out.println(internetOrder);
                    yield true;
                }
                default -> {
                    internetOrder = null;
                    System.out.println("Заказ отменен");
                    yield false;
                }
            };

        }
        return internetOrder;
    }
    public static Order Table(){
        System.out.print("Введите возраст: ");
        int age = num.nextInt();

        Order tableOrder = new TableOrder();
        int option;
        boolean outerFlag = true;
        boolean innerFlag;
        while(outerFlag){
            System.out.println("Интернет-заказ:");
            System.out.println("1. Добавить блюдо в заказ");
            System.out.println("2. Добавить напиток в заказ");
            System.out.println("3. Удалить позицию из заказа");
            System.out.println("4. Создать заказ");
            System.out.println("5. Отменить заказ");
            System.out.println("6. Посмотреть позиции");
            option = num.nextInt();
            outerFlag = switch (option){
                case 1 -> {
                    System.out.print("Введите название: ");
                    String name = str.nextLine();
                    System.out.print("Введите описание: ");
                    String description = str.nextLine();
                    System.out.print("Введите цену: ");
                    int cost = num.nextInt();
                    innerFlag = tableOrder.add(new Dish(cost,name,description));
                    if(innerFlag){
                        System.out.println("Блюдо успешно добавлено");
                    }
                    else {
                        System.out.println("Ошибка! Блюдо не добавлено");
                    }
                    yield true;
                }
                case 2 -> {
                    DrinkTypeEnum type = DrinkTypeEnum.menu(age);
                    System.out.print("Введите название: ");
                    String name = str.nextLine();
                    System.out.print("Введите описание: ");
                    String description = str.nextLine();
                    System.out.print("Введите цену: ");
                    int cost = num.nextInt();
                    innerFlag = tableOrder.add(new Drink(cost,name,description, type));
                    if(innerFlag){
                        System.out.println("Напиток успешно добавлен");
                    }
                    else {
                        System.out.println("Ошибка! Напиток не добавлен");
                    }
                    yield true;
                }
                case 3 -> {
                    if(tableOrder.itemsQuantity()!=0){
                        System.out.println(tableOrder);
                        System.out.println("Введите название: ");
                        innerFlag = tableOrder.remove(str.nextLine());
                        if(innerFlag){
                            System.out.println("Позиция удалена");
                        }
                        else {
                            System.out.println("Ошибка! Позиция не удалена");
                        }
                    }
                    yield true;
                }
                case 4 -> false;
                case 6 -> {
                    System.out.println(tableOrder);
                    yield true;
                }
                default -> {
                    tableOrder = null;
                    System.out.println("Заказ отменен");
                    yield false;
                }
            };

        }
        return tableOrder;
    }

    public static void main(String[] args) {
        str = new Scanner(System.in);
        num = new Scanner(System.in);
        dou = new Scanner(System.in);
        cha = new Scanner(System.in);
        int tables;
        int option;
        InternetOrdersManager internetOrdersManager = new InternetOrdersManager();
        System.out.print("Введите количество столов: ");
        tables = num.nextInt();
        TableOrdersManager tableOrdersManager = new TableOrdersManager(tables);
        boolean outerFlag = true;
        boolean innerFlag;
        while(outerFlag){
            System.out.println("1. Посмотреть интернет заказы");
            System.out.println("2. Посмотреть кафе заказы");
            System.out.println("3. Добавить интернет заказ");
            System.out.println("4. Добавить кафе заказ");
            System.out.println("5. Удалить/Закрыть интернет заказ");
            System.out.println("6. Удалить/Закрыть кафе заказы");
            System.out.println("7. Статус столов");
            System.out.println("0. Выйти");
            System.out.print("Ввод: ");
            option = num.nextInt();
            outerFlag = switch (option){
                case 1 -> {
                    System.out.println(internetOrdersManager);
                    yield true;
                }
                case 2 -> {
                    System.out.println(tableOrdersManager);
                    yield true;
                }
                case 3 -> {
                    internetOrdersManager.add(Internet());
                    yield true;
                }
                case 4 -> {
                    System.out.println("Введите номер столика:");
                    int table = num.nextInt();
                    if(table<=tables&&table>0){
                        tableOrdersManager.add(Table(), table-1);
                    }
                    else {
                        System.out.println("Ошибка! Столика не существует");
                    }
                    yield true;
                }
                case 5 -> {
                    internetOrdersManager.remove();
                    yield true;
                }
                case 6 -> {
                    System.out.println(tableOrdersManager);

                    System.out.println("Введите номер столика:");
                    int table = num.nextInt();
                    if(table<=tables&&table>0){
                        tableOrdersManager.remove(table-1);
                    }
                    else {
                        System.out.println("Ошибка! Столика не существует");
                    }
                    yield true;
                }
                case 7 -> {
                    System.out.println("Всего столиков: " + tables);
                    int[] free = tableOrdersManager.freeTablesNumbers();
                    for (int i = 0; i < free.length; i++){
                        System.out.println("Столик № " + (free[i]+1) + " свободен");
                    }
                    yield true;
                }
                default -> false;
            };
        }
    }
}
