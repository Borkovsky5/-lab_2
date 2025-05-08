package lab2_1;

import java.util.Scanner;

public class Task7 {
    public static void task7(Scanner scanner) {
        System.out.println("Меню:");
        System.out.println("1 - Добуток двох чисел");
        System.out.println("2 - Сума двох чисел");
        System.out.println("3 - Рiзниця двох чисел");

        System.out.print("Ваш вибiр: ");
        int choice = scanner.nextInt();

        System.out.print("Введiть перше число: ");
        int a = scanner.nextInt();
        System.out.print("Введiть друге число: ");
        int b = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Добуток: " + (a * b));
            case 2 -> System.out.println("Сума: " + (a + b));
            case 3 -> System.out.println("Рiзниця: " + (a - b));
            default -> System.out.println("Невiрний вибiр.");
        }
    }
}