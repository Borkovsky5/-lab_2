package lab2_1;

import java.util.Scanner;

public class Task3 {
    public static void task3(Scanner scanner) {
        System.out.print("Введiть номер мiсяця (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 день");
            case 4, 6, 9, 11 -> System.out.println("30 днiв");
            case 2 -> System.out.println("28 або 29 днів");
            default -> System.out.println("Невiрний номер мiсяця.");
        }
    }
}