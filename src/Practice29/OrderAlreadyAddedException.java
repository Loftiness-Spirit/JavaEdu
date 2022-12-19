package Practice29;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(String string)
    {
        super(string);
    }
}