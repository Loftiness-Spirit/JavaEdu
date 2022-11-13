package Practice13.Task1;

public class Main {
    public static int BackIndex(String string)
    {
        return string.length() - 1;
    }


    public static void main(String[] args) {
        String s = new String("I like Java!!!");
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replaceAll("a","o"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("Java")+4));

    }
}
