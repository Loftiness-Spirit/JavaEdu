package Practice7.Task4;

public class MathFunc implements MathCalculable {
    @Override
    public double pow(double x, int n) {
        double res=x;
        if (n==0){
            res=1;
            return res;
        }
        else if(n>0){
            for (int i = 1;i<n;++i){
                res=res*x;
            }
            return res;
        }
        else{
            res=1;
            for (int i = n;i<0;++i){
                res=res/x;
            }
            return res;
        }
    }
    public double abs(double a, double b) {
        return Math.sqrt(((a*a)+(b*b)));
    }

    @Override
    public double PI() {
        return 3.1415926535;
    }
}
