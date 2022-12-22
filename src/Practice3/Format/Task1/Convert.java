package Practice3.Format.Task1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Выберете операцию");
        System.out.println("1) Рубли в доллары");
        System.out.println("2) Доллары в рубли");
        System.out.println("3) Рубли в евро");
        System.out.println("4) Евро в рубли");
        int option= s.nextInt();
        Locale rus = new Locale("ru", "RU");
        NumberFormat ru = NumberFormat.getCurrencyInstance(rus);
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat eu = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        switch (option){
            case 1:
                System.out.println("Сколько рублей конверитровать?");
                double rub=s.nextDouble();
                System.out.println(ru.format(rub)+" = "+us.format(rub*0.016327));
                break;

            case 2:
                System.out.println("Сколько долларов конверитровать?");
                double usd=s.nextDouble();
                System.out.println(us.format(usd)+" = "+ru.format(usd*61.25));
                break;
            case 3:
                System.out.println("Сколько рублей конверитровать?");
                double ruble=s.nextDouble();
                System.out.println(ru.format(ruble)+" = "+eu.format(ruble*0.016673));
                break;
            case 4:
                System.out.println("Сколько евро конверитровать?");
                double eur=s.nextDouble();
                System.out.println(eu.format(eur)+" = "+ru.format(eur*59.98));
                break;
        }
        s.close();
    }
}
