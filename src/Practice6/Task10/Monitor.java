package Practice6.Task10;

public class Monitor implements id{
    private String name;
    private double Hz;
    private byte Diagonal;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPower() {
        return Hz;
    }

    @Override
    public void setPower(double power) {
        Hz=power;
    }

    @Override
    public byte getObject() {
        return Diagonal;
    }

    @Override
    public void setObject(byte object) {
        Diagonal = object;
    }
}
