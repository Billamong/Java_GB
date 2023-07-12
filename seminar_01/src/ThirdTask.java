import java.util.Scanner;

/*
Дан некоторый массив, например [1,1,0,1,1,1],
вывести максимальное количество подряд идущего наперед заданного числа.
 */
public class ThirdTask {
    int size;
    int[] array;
    int a;

    public ThirdTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        size = in.nextInt();
        System.out.println("Введите массив");
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("Введите целевое число");
        a = in.nextInt();
        in.close();
    }

    public void getMax() {
        int counter = 0;
        int anotherCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                anotherCounter++;
            } else if (anotherCounter != 0) {
                if (counter < anotherCounter) {
                    counter = anotherCounter;
                }
                anotherCounter = 0;
            }
        }
        // Условие ? true : false
        int answer = counter < anotherCounter ? anotherCounter : counter;
        System.out.println("Максимальное число подряд идущих " + answer);
    }
}
