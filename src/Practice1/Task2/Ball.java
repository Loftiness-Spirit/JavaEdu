package Practice1.Task2;

public class Ball {
    private int mass;
    private int round;

    public Ball(int a, int b){
        mass=a;
        round=b;
    }
    public Ball(){
        mass=0;
        round=0;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getMass() {
        return mass;
    }

    public int getRound() {
        return round;
    }

    public String toString() {
        return "Ball{" +
                "mass=" + mass +
                ", round=" + round +
                '}';
    }
    public void sport(){
        if (mass<=450&&round<=70)
            System.out.println("It's for football");
        if (mass>450&&round>70)
            System.out.println("It's for basketball");
    }
}
