package Practice6.Task11;

public class Temperature implements Convertable{
    private double KelvinAdd = 273.15;
    private double FahrenheitMulti = 1.8;

    @Override
    public double convert(double x, int y) {
        if(y==1){
            return x+KelvinAdd;
        }
        else return x*FahrenheitMulti+32;
    }
}
