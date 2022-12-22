package Practice4.Task4;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer();
        System.out.println(comp.cpu.getVoltage());
        comp.cpu.uppervolt(0.15);
        System.out.println(comp.cpu.getFreq());
        System.out.println(comp.cpu.getVoltage());
        comp.mem.addInMem("123");
        comp.mem.printMem();
        System.out.println(comp.moni.getPpi());
    }
}
