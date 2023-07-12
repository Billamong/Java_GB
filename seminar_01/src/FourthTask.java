import java.util.Scanner;

/*
Во фразе "Добро пожаловать на курс по Java" переставить
слова в обратном порядке.
 */
public class FourthTask {
    String str;

    public FourthTask() {
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        in.close();
    }

    public void printReverseString() {
        String[] s = str.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }
}
