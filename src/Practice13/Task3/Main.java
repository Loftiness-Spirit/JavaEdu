package Practice13.Task3;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Россия,Москва,Москва,Южнобутовская,87,7,25");
        System.out.println(address1);
        Address address2 = new Address("Россия,Москва,Москва,Южнобутовская,87,7,25");
        System.out.println(address2);
        Address address3 = new Address("Россия.Москва.Москва.Южнобутовская.87.7.25");
        System.out.println(address3);
        Address address4 = new Address("Россия;Москва;Москва;Южнобутовская;87;7;25");
        System.out.println(address4);
    }
}
