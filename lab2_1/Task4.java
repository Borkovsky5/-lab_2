package lab2_1;

import java.util.Scanner;

public class Task4 {
    public static void task4(Scanner scanner) {
        System.out.println("Меню:");
        System.out.println("1 - Привiтання");
        System.out.println("2 - Запрошення до роботи");
        System.out.println("3 - Завершити роботу");

        System.out.print("Ваш вибiр: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Привiт! Гарного дня!");
            case 2 -> System.out.println("Можете почати працювати на комп’ютерi.");
            case 3 -> System.out.println("Роботу завершено. До побачення!");
            default -> System.out.println("Невiрний вибiр.");
        }
    }
}

