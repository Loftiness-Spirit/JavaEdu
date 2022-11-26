package Practice18.Task8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        String key = "";
        while (true) {
            try {
                Scanner myScanner = new Scanner(System.in);
                key = myScanner.nextLine();
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Have another try");
            }
        }
    }
    public void printDetails(String key) throws Exception{
        try {
            String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {

            throw new Exception( "Key set to empty string" );
        }
        else return "data for " + key;
    }
}
