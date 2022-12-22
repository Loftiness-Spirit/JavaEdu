package Practice6.Task10;

public class Memory implements id{
    private String name;
    private double MHz;
    private byte Gigabyte;

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
        return MHz;
    }

    @Override
    public void setPower(double power) {
        MHz=power;
    }

    @Override
    public byte getObject() {
        return Gigabyte;
    }

    @Override
    public void setObject(byte object) {
        Gigabyte = object;
    }
}
