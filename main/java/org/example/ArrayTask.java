package org.example;
import java.util.Scanner;
import java.util.Arrays;


public class ArrayTask {
    static void main(String[] args) {
        int[] numbers = {10, 25, 7, 42, 15};
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("массивчик: " + Arrays.toString(numbers));
            System.out.print("1 - добавить, 2 - удалить, 0 - ВЫЙТИИИИИИИИ:  ");
            int action = sc.nextInt();

            if (action == 0) {
                System.out.println("Все бб!!!");
                break;
            }
            if (action != 1 && action != 2) {
                System.out.println("ЭЭэ не то выбрали, там 1 или 2 или 0");
            }

            if (action == 1) {
                System.out.print("Числяки: ");
                int value = sc.nextInt();

                int[] newNum = new int[numbers.length + 1];

                for (int i = 0; i < numbers.length; i++) {
                    newNum[i] = numbers[i];
                }
                newNum[numbers.length] = value;
                numbers = newNum;
            } else {
                System.out.print("Индекс: ");
                int index = sc.nextInt();
                if (index < 0 || index >= numbers.length) {
                    System.out.println("ЭЭэ, такого индекс нет");
                    continue;
                }
                int[] newNum = new int[numbers.length - 1];
                for (int i = 0; i < index; i++) {
                    newNum[i] = numbers[i];
                }
                for (int i = index + 1; i < numbers.length; i++) {
                    newNum[i - 1] = numbers[i];
                }
                numbers = newNum;
            }
            System.out.println("Резик: " + Arrays.toString(numbers));
        }
    }
}

