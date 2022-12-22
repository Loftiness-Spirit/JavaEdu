package Practice32;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
public class FileManager {
    public static void write(String name, String text)
    {
        File file;
        file = new File(name);

        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file.getAbsoluteFile());
            try {

                printWriter.print(text);
            } finally {
                printWriter.close();
            }
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static TableOrdersManager readT(String name) throws FileNotFoundException
    {
        int size, length;
        File file;
        file = new File(name);
        TableOrdersManager tableOrdersManager = null;
        TableOrder[] tableOrder;
        MenuItem[][] menuItems;
        String nameItem, description, type;
        int price;
        double alcoholDegree;
        boolean[] Table;

        try {
            if(!file.exists()){
                tableOrdersManager = null;;
            }
            else {
                if (FileManager.Zero(name) == false)
                {
                    return null;
                }
                Scanner scanner = new Scanner(file);
                try {
                    size = scanner.nextInt();
                    length = scanner.nextInt();
                    menuItems = new MenuItem[length][];
                    tableOrder = new TableOrder[size];
                    Table = new boolean[length];
                    for (int i = 0; i < size; i++)
                    {
                        if (scanner.next().equals("null") == false) {
                            Table[i] = true;
                            menuItems[i] = new MenuItem[scanner.nextInt()];
                            for (int j = 0; j < menuItems[i].length; j++) {
                                if (scanner.next().equals("Dish") == true) {
                                    nameItem = "";
                                    do {
                                        nameItem += scanner.next();
                                        if (nameItem.charAt(nameItem.length() - 1) != '\'') {
                                            nameItem += " ";
                                        } else {
                                            nameItem = nameItem.replace("'", "");
                                            break;
                                        }
                                    } while (true);
                                    price = scanner.nextInt();
                                    description = "";
                                    do {
                                        description += scanner.next();
                                        if (description.charAt(description.length() - 1) != '\'') {
                                            description += " ";
                                        } else {
                                            description = description.replace("'", "");
                                            break;
                                        }
                                    } while (true);
                                    menuItems[i][j] = new Dish(price, nameItem, description);
                                }
                                else {
                                    type =  scanner.next();
                                    nameItem = "";
                                    do {
                                        nameItem += scanner.next();
                                        if (nameItem.charAt(nameItem.length() - 1) != '\'') {
                                            nameItem += " ";
                                        } else {
                                            nameItem = nameItem.replace("'", "");
                                            break;
                                        }
                                    } while (true);
                                    price = scanner.nextInt();
                                    description = "";
                                    do {
                                        description += scanner.next();
                                        if (description.charAt(description.length() - 1) != '\'') {
                                            description += " ";
                                        } else {
                                            description = description.replace("'", "");
                                            break;
                                        }
                                    } while (true);
                                    menuItems[i][j] = new Drink(price,nameItem,description, DrinkTypeEnum.get(type));
                                }
                            }
                            tableOrder[i] = new TableOrder(menuItems[i]);
                        }
                        else
                        {
                            Table[i] = false;
                        }
                    }
                    tableOrdersManager = new TableOrdersManager(length);
                    int sch = 0;
                    for (int i = 0; i < Table.length; ++i)
                    {
                        if (Table[i] == true)
                        {
                            tableOrdersManager.add(tableOrder[sch], i);
                            ++sch;
                        }
                    }
                } finally {
                    scanner.close();
                }
            }
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }

        return tableOrdersManager;

    }

    public static InternetOrdersManager readI(String name) throws FileNotFoundException
    {
        int size, home, id, flat;
        File file;
        file = new File(name);
        InternetOrdersManager internetOrdersManager = null;
        InternetOrder[] internetOrders;
        Address[] addresses;
        MenuItem[][] menuItems;
        String nameItem, description, type;
        String city, street;
        char korpus;
        int price;

        try {
            if(!file.exists()){
                internetOrdersManager = null;;
            }
            else {
                if (FileManager.Zero(name) == false)
                {
                    return null;
                }
                Scanner scanner = new Scanner(file);
                try {
                    size = scanner.nextInt();
                    addresses = new Address[size];
                    menuItems = new MenuItem[size][];
                    internetOrders = new InternetOrder[size];
                    for (int i = 0; i < size; ++i)
                    {
                        city = "";
                        do {
                            city += scanner.next();
                            if (city.charAt(city.length() - 1) != '\'') {
                                city += " ";
                            } else {
                                city = city.replace("'", "");
                                break;
                            }
                        } while (true);
                        id = scanner.nextInt();
                        street = "";
                        do {
                            street += scanner.next();
                            if (street.charAt(street.length() - 1) != '\'') {
                                street += " ";
                            } else {
                                street = street.replace("'", "");
                                break;
                            }
                        } while (true);
                        home = scanner.nextInt();
                        korpus = scanner.next().charAt(0);
                        flat = scanner.nextInt();
                        addresses[i] = new Address(city, id, street, home, korpus, flat);
                        menuItems[i] = new MenuItem[scanner.nextInt()];
                        for (int j = 0; j < menuItems[i].length; ++j) {
                            if (scanner.next().equals("Dish") == true) {
                                nameItem = "";
                                do {
                                    nameItem += scanner.next();
                                    if (nameItem.charAt(nameItem.length() - 1) != '\'') {
                                        nameItem += " ";
                                    } else {
                                        nameItem = nameItem.replace("'", "");
                                        break;
                                    }
                                } while (true);
                                price = scanner.nextInt();
                                description = "";
                                do {
                                    description += scanner.next();
                                    if (description.charAt(description.length() - 1) != '\'') {
                                        description += " ";
                                    } else {
                                        description = description.replace("'", "");
                                        break;
                                    }
                                } while (true);
                                menuItems[i][j] = new Dish(price, nameItem, description);
                            }
                            else {
                                type =  scanner.next();
                                nameItem = "";
                                do {
                                    nameItem += scanner.next();
                                    if (nameItem.charAt(nameItem.length() - 1) != '\'') {
                                        nameItem += " ";
                                    } else {
                                        nameItem = nameItem.replace("'", "");
                                        break;
                                    }
                                } while (true);
                                price = scanner.nextInt();
                                description = "";
                                do {
                                    description += scanner.next();
                                    if (description.charAt(description.length() - 1) != '\'') {
                                        description += " ";
                                    } else {
                                        description = description.replace("'", "");
                                        break;
                                    }
                                } while (true);
                                menuItems[i][j] = new Drink(price,nameItem,description, DrinkTypeEnum.get(type));
                            }
                        }
                        internetOrders[i] = new InternetOrder(addresses[i], menuItems[i]);

                    }
                    internetOrdersManager = new InternetOrdersManager();
                    for (int i = 0; i < size; ++i)
                    {
                        internetOrdersManager.add(internetOrders[i]);
                    }
                } finally {
                    scanner.close();
                }
            }
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }

        return internetOrdersManager;

    }

    public static boolean Zero(String name) throws FileNotFoundException
    {
        File file = new File(name);
        boolean otvet = true;
        try {
            Scanner scanner = new Scanner(file);
            try {
                String a = scanner.next();
                if (a.equals("null") == true)
                {
                    otvet = false;
                }
            }
            finally {
                scanner.close();
            }
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
        return otvet;
    }

    public static void Clear(String name)
    {
        File file;
        file = new File(name);
        String text = "null";
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file.getAbsoluteFile());
            try {
                printWriter.print(text);
            } finally {
                printWriter.close();
            }
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
