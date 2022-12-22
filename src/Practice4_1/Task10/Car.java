package Practice4_1.Task10;

public class Car extends Transport{
    public Car(double speed, double range, double sits){
        this.range=range;
        this.speed=speed;
        this.sits=sits;
    }
    public void searchTime(){
        System.out.println("Time is "+this.range/this.speed+" points");
    }
    public void searchPrice(){
        System.out.println("Price is " +100/this.sits+" tokens");
    }
    public void searchWeightPrice(){
        System.out.println("Weight price is " +10000/this.range/this.speed+" tokens");
    }
}
