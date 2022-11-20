package Practice18.Task6;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    public String getDetails(String key) {
        try {

            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }}
        catch (NullPointerException e){
            System.out.println("null key");
        }
        return "data for " + key;
    }
}
