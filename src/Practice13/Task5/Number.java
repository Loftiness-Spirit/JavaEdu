package Practice13.Task5;

public class Number {
    private final String number;

    Number (String number){
        this.number = number;
    }
    public String transfer(){
        String code;
        if(number.charAt(0)=='+')
            code = number.substring(0,number.length()-10);
        else
            code = "+7";
        return code +number.substring(number.length()-10,number.length()-7)+"-"+number.substring(number.length()-7,
                number.length()-4)+"-"+number.substring(number.length()-4);

    }


}
