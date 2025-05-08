package lab2_1;

import java.util.Scanner;

public class Task5 {
    public static void task5(Scanner scanner) {
        System.out.print("Введiть номер пари (1-4): ");
        int pair = scanner.nextInt();
        switch (pair) {
            case 1 -> System.out.println("Програмування");
            case 2 -> System.out.println("Сигнали мереж");
            case 3 -> System.out.println("Фiлософiя");
            case 4 -> System.out.println("Вимiрювання");
            default -> System.out.println("Невiрний номер пари.");
        }
    }
}