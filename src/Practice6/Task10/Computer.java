package Practice6.Task10;

import java.util.Scanner;

public class Computer {
    private String name;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Название компьютера: ");
        name = scanner.nextLine();

        processor = new Processor();
        System.out.println("Процессор: ");
        processor.setName(scanner.nextLine());
        System.out.println("Введите частоту процессора: ");
        processor.setPower(scanner.nextDouble());
        System.out.println("Введите кол-во ядер");
        processor.setObject(scanner.nextByte());
        scanner.nextLine();

        memory = new Memory();
        System.out.println("Память: ");
        memory.setName(scanner.nextLine());
        System.out.println("Введите частоту памяти: ");
        memory.setPower(scanner.nextDouble());
        System.out.println("Введите кол-во гигабайт");
        memory.setObject(scanner.nextByte());
        scanner.nextLine();

        monitor = new Monitor();
        System.out.println("Монитор: ");
        monitor.setName(scanner.nextLine());
        System.out.println("Введите частоту монитора: ");
        monitor.setPower(scanner.nextDouble());
        System.out.println("Введите диагональ монитора");
        monitor.setObject(scanner.nextByte());
    }
    public String getCpuName()
    {
        return processor.getName();
    }

    public String getRamName()
    {
        return memory.getName();
    }

    public String getMonName()
    {
        return monitor.getName();
    }

    public double getCpuPower()
    {
        return processor.getPower();
    }

    public double getRamPower()
    {
        return memory.getPower();
    }

    public double getMonPower()
    {
        return monitor.getPower();
    }

    public int getCpuObj()
    {
        return processor.getObject();
    }

    public int getRamObj()
    {
        return memory.getObject();
    }

    public int getMonObj()
    {
        return monitor.getObject();
    }

    public String getName() {
        return name;
    }

    public String getCPU()
    {
        return "Processor: "+processor.getName()+",GHz: "+processor.getPower()+",Core: "+processor.getObject();
    }

    public String getRAM()
    {
        return "Memory: "+memory.getName()+",MHz: "+memory.getPower()+",Gigabyte: "+memory.getObject();
    }

    public String getMonitor()
    {
        return "Monitor: "+monitor.getName()+",Hz: "+monitor.getPower()+",Diagonal: "+monitor.getObject();
    }
}
