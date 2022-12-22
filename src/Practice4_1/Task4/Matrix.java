package Practice4_1.Task4;

import java.util.Random;

public class Matrix {
    private double [][] matrix;
    private int n;
    private int m;
    public Matrix(){
    }
    public Matrix(int n, int m){
        this.n=n;
        this.m=m;
    }
    public Matrix(int n, int m, double a[][]){
        this.n=n;
        this.m=m;
        this.matrix=a;
    }

    public void setMatrix() {
        Random rand=new Random();
        matrix= new double[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=rand.nextDouble();
            }
        }
        ;    }
    public Matrix sum(Matrix a, Matrix b){
        if (a.matrix.length==b.matrix.length) {
            this.n = a.n;
            this.m = a.m;
            this.matrix=new double[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    this.matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
                }
            }
        }
        return this;
    }
    public void multi(int x){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.matrix[i][j] = this.matrix[i][j] * x;
            }
        }
    }

    public void out(){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
