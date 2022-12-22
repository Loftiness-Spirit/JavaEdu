package Practice4.Task4;

public class Computer {
    private enum Brand {
        APPLE,
        HP,
        ASUS;
    }
    public static void  diverse(Brand brand){
        switch (brand){
            case ASUS:
                System.out.println(brand);
                Computer a = new Computer(3.5,0.5,1920,1080,21);
                System.out.println("cpu_v = " + a.cpu.getVoltage() + " cpu_v = " + a.cpu.getFreq());
                System.out.println("monitor width = "+ a.moni.getWidth()+" monitor height = "+ a.moni.getHeight()+" monitor size = "+ a.moni.getSize());
                System.out.println("ppi = "+ a.moni.getPpi());
                a.mem.addInMem("123");
                a.mem.printMem();
                break;
            case HP:
                System.out.println(brand);
                Computer h = new Computer(3.4,0.5,1280,720,21);
                System.out.println("cpu_v = " + h.cpu.getVoltage() + " cpu_v = " + h.cpu.getFreq());
                System.out.println("monitor width = "+ h.moni.getWidth()+" monitor height = "+ h.moni.getHeight()+" monitor size = "+ h.moni.getSize());
                System.out.println("ppi = "+ h.moni.getPpi());
                h.mem.addInMem("123");
                h.mem.printMem();
                break;
            case APPLE:
                System.out.println(brand);
                Computer c = new Computer(0.005,0.4,100,100,4);
                System.out.println("cpu_v = " + c.cpu.getVoltage() + " cpu_v = " + c.cpu.getFreq());
                System.out.println("monitor width = "+ c.moni.getWidth()+" monitor height = "+ c.moni.getHeight()+" monitor size = "+ c.moni.getSize());
                System.out.println("ppi = "+ c.moni.getPpi());
                c.mem.addInMem("123");
                c.mem.printMem();
                break;
        }
    }
    public Processor cpu;
    public Memory mem;
    public Monitor moni;

    public Computer(){
        cpu = new Processor();
        mem = new Memory();
        moni = new Monitor();
    }

    public Computer(double cpu_f, double cpu_v, int m_width, int m_height, int m_size) {
        cpu = new Processor(cpu_f, cpu_v);
        mem = new Memory();
        moni = new Monitor(m_width, m_height, m_size);
    }

    public static void main(String[] args) {
        diverse(Brand.APPLE);
        diverse(Brand.HP);
        diverse(Brand.ASUS);
    }
}
