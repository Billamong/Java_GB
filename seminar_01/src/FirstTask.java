import java.util.Scanner;

/*
Написать программу, которая запросит пользователя ввести <Имя> в консоли.
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */
public class FirstTask {
    //int, char, float, double, byte, ...
    String name;

    public FirstTask() {
        System.out.println("Введите имя!");
        Scanner input = new Scanner(System.in);
        name = input.next();
        input.close();
    }

    public void printHelloName() {
        System.out.println("Привет, " + name);
    }
}
