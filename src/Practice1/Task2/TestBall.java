package Practice1.Task2;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball(370,65);
        Ball b2 = new Ball(500,71);
        Ball b3 = new Ball();
        b3.setMass(450);
        b3.setRound(70);
        System.out.println(b1);
        b1.sport();
        b2.sport();
        b3.sport();
    }
}
