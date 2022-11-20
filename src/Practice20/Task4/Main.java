package Practice20.Task4;

public class Main {
    public static void main(String[] args) {
        MinMax<Double> minMax = new MinMax<>(new Double[]{1.2,1.3,2.3,2.4});
        System.out.println(Calculator.divide(minMax.Max(),minMax.Min()));
    }
}
