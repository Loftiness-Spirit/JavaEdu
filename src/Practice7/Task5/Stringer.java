package Practice7.Task5;

public class Stringer implements Stringable{
    @Override
    public int count(String s) {
        return s.length();
    }

    @Override
    public String odd(String s) {
        String odd = "";
        for (int i = 0;i<s.length();i++){
            odd+=" "+s.charAt(i);
        }
        return odd;
    }

    @Override
    public String reverse(String s) {
        String rev = "";
        for (int i = s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }
}
