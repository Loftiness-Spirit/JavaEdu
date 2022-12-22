package Practice6.Task10;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    static ArrayList<Computer> A;
    public static String NameSearch(String name){
        for(int i = 0;i < A.size();i++){
            if(A.get(i).getName().equals(name)){
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }
    public static String ProcessorSearch(String name){
        for(int i = 0;i < A.size();i++){
            if(A.get(i).getCpuName().equals(name)){
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }
    public static String MemorySearch(String name){
        for(int i = 0;i < A.size();i++){
            if(A.get(i).getRamName().equals(name)){
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }
    public static String MonitorSearch(String name){
        for(int i = 0;i < A.size();i++){
            if(A.get(i).getCpuName().equals(name)){
                return "Компьютер номер "+i+"\n"+A.get(i).getName()+"\n"+A.get(i).getCPU()+"\n"+A.get(i).getRAM()+"\n"+A.get(i).getMonitor();
            }
        }
        return "Компьютер не найден";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во компьютеров: ");
        int n = scanner.nextInt();
        String s;
        A = new ArrayList<>(n);
        Computer computer;
        for (int i = 0;i<n;i++){
            computer=new Computer();
            A.add(i,computer);
        }


        while (true) {
            System.out.println("Опции: ");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    computer = new Computer();
                    A.add(computer);
                    break;
                case 2:
                    System.out.println("Введите номер компьютера: ");
                    n = scanner.nextInt();
                    A.remove(n);
                    System.out.println("Компьютер удален");
                    break;
                case 3:
                    System.out.println("Опции поиска: ");
                    System.out.println("1. По названию компьютера");
                    System.out.println("2. По названию процессора");
                    System.out.println("3. По названию памяти");
                    System.out.println("4. По названию монитора");
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.println("Введите название компьютера: ");
                            s = scanner.nextLine();
                            s = scanner.nextLine();
                            System.out.println(NameSearch(s));
                            break;
                        case 2:
                            System.out.println("Введите название процессора: ");
                            s = scanner.nextLine();
                            s = scanner.nextLine();
                            System.out.println(ProcessorSearch(s));
                            break;
                        case 3:
                            System.out.println("Введите название памяти: ");
                            s = scanner.nextLine();
                            s = scanner.nextLine();
                            System.out.println(MemorySearch(s));
                            break;
                        case 4:
                            System.out.println("Введите название монитора: ");
                            s = scanner.nextLine();
                            s = scanner.nextLine();
                            System.out.println(MonitorSearch(s));
                            break;
                    }
            }
        }
    }
}
