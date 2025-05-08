package lab2_1;

import java.util.Scanner;

public class Task2 {
    public static void task2(Scanner scanner) {
        System.out.print("Введiть номер мiсяця (1-12): ");
        int month = scanner.nextInt();
        switch (month) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лiто");
            case 9, 10, 11 -> System.out.println("Осiнь");
            default -> System.out.println("Невiрний номер мiсяця.");
        }
    }
}
