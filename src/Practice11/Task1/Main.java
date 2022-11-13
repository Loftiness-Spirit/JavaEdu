package Practice11.Task1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("Фамилия: Крылов Задание выдано dd MMMM yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(2022,Calendar.OCTOBER, 25, 14,23,18);
        System.out.println(sdf.format(cal.getTime()));
        sdf = new SimpleDateFormat("Фамилия: Крылов Задание сдано dd MMMM yyyy HH:mm:ss");
        Date now = new Date();
        System.out.println(sdf.format(now));
    }
}
