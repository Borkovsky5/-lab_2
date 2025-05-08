package lab2_1;

import java.util.Scanner;

public class Task1 {
    public static void task1(Scanner scanner) {
        System.out.print("Введiть номер дня тижня (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 6, 7 -> System.out.println("Це вихiдний день.");
            case 1, 2, 3, 4, 5 -> System.out.println("Це робочий день.");
            default -> System.out.println("Невiрний номер дня.");
        }
    }
}
