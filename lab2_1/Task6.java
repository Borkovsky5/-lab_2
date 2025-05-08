package lab2_1;

import java.util.Scanner;

public class Task6 {
    public static void task6(Scanner scanner) {
        System.out.print("Введiть хвилину (0-59): ");
        int min = scanner.nextInt();

        if (min < 0 || min > 59) {
            System.out.println("Невiрне значення хвилини.");
        } else if (min < 15) {
            System.out.println("Перша чверть години.");
        } else if (min < 30) {
            System.out.println("Друга чверть години.");
        } else if (min < 45) {
            System.out.println("Третя чверть години.");
        } else {
            System.out.println("Четверта чверть години.");
        }
    }
}
