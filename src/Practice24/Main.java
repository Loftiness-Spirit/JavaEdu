package Practice24;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String in;
    public static ArrayList<IDocument> filesList = new ArrayList();
    public static Scanner scanner;

    public Main() {
    }

    public static void create(String type) {
        System.out.print("Введите название файла: ");
        String bufName = scanner.nextLine();

        for(int i = 0; i < filesList.size(); ++i) {
            if (((IDocument)filesList.get(i)).getType().equals(bufName)) {
                System.out.println("Ошибка, IDocument с таким именем уже существует, IDocument не создан.");
                return;
            }
        }

        System.out.print("Введите данные: ");
        String bufData = scanner.nextLine();
        filesList.add(CreateIDocument.getIDocument(type, bufName, bufData));
        System.out.println(type + " создан!");
    }

    public static void main(String[] args) {
        boolean end = false;
        boolean file = false;
        System.out.println("Добро пожаловать в IRedactor");

        do {
            System.out.println("Меню: 1.Создать 2.Открыть 0.Выход");
            in = scanner.nextLine();
            switch (in.charAt(0)) {
                case '0':
                    end = true;
                    break;
                case '1':
                    System.out.println("Выберете тип файла: 1 - TextDocument, 2 - ImageDocument, 3 - MusicDocument");
                    in = scanner.nextLine();
                    switch (in.charAt(0)) {
                        case '1':
                            create("textdocument");
                            continue;
                        case '2':
                            create("imagedocument");
                            continue;
                        case '3':
                            create("musicdocument");
                            continue;
                        default:
                            System.out.println("Ошибка создания IDocument'а, IDocument не создан.");
                            continue;
                    }
                case '2':
                    System.out.print("Введите название файла: ");
                    in = scanner.nextLine();
                    file = false;

                    for(int i = 0; i < filesList.size(); ++i) {
                        if (in.equals(((IDocument)filesList.get(i)).getName())) {
                            file = true;
                            System.out.println(((IDocument)filesList.get(i)).toString());
                            break;
                        }
                    }

                    if (!file) {
                        System.out.println("IDocument " + in + " не найден.");
                    }
            }
        } while(!end);

    }

    static {
        scanner = new Scanner(System.in);
    }
}
