package Practice7.Task3;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    private int width;
    private int length;

    public MovableRectangle(int x1,int y1,int x2,int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
        width=y2-y1;
        length=x2-x1;
    }

    @Override
    public String toString() {
        return "MovableRectangle width = "+width+" length = "+length+"\n"+ "topLeft"+topLeft+"\n"+"bottomRight"+bottomRight;
    }
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    public boolean SpeedTest(){
        if(topLeft.getxSpeed()==bottomRight.getxSpeed()&&topLeft.getySpeed()==bottomRight.getySpeed())
            return true;
        else
            return false;
    }

}
