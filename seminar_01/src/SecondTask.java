import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
В консоли запросить имя пользователя. В зависимости от текущего времени,
вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

 */
public class SecondTask {
    String name;

    public SecondTask() {
        System.out.println("Введите имя!");
        Scanner input = new Scanner(System.in);
        name = input.next();
        input.close();
    }

    public void goodTime() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Календарь " + calendar);
        System.out.println("Date " + new Date());
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        // &, |, &&, ||
        if (hourOfDay >= 5 && hourOfDay < 12) {
            System.out.println("Доброе утро, " + name);
        } else if (hourOfDay >= 12 && hourOfDay < 18) {
            System.out.println("Добрый день, " + name);
        } else if (hourOfDay >= 18 && hourOfDay < 23) {
            System.out.println("Добрый вечер, " + name);
        } else {
            System.out.println("Доброй ночи, " + name);
        }
    }
}
