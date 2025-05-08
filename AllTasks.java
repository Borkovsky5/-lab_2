import java.util.Scanner;

public class AllTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // === 1. Розв’язок квадратного рівняння ===
        System.out.println("1. Розв'язання квадратного рiвняння: ax^2 + bx + c = 0");
        System.out.print("Введiть a: ");
        double a = scanner.nextDouble();
        System.out.print("Введiть b: ");
        double b = scanner.nextDouble();
        System.out.print("Введiть c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Два коренi: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Один корiнь: x = " + x);
        } else {
            System.out.println("Коренiв немає (дискримiнант < 0)");
        }

        // === 2. Номер квадранта ===
        System.out.println("\n2. Визначення квадранта для точки (x, y)");
        System.out.print("Введiть x: ");
        double pointX = scanner.nextDouble();
        System.out.print("Введiть y: ");
        double pointY = scanner.nextDouble();

        if (pointX > 0 && pointY > 0) {
            System.out.println("I квадрант");
        } else if (pointX < 0 && pointY > 0) {
            System.out.println("II квадрант");
        } else if (pointX < 0 && pointY < 0) {
            System.out.println("III квадрант");
        } else if (pointX > 0 && pointY < 0) {
            System.out.println("IV квадрант");
        } else if (pointX == 0 && pointY == 0) {
            System.out.println("Точка в початку координат");
        } else {
            System.out.println("Точка лежить на однiй з осей");
        }

        // === 3. Число двозначне та парне ===
        System.out.println("\n3. Перевiрка: чи є число двозначним i парним?");
        System.out.print("Введiть цiле число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99 && number % 2 == 0) {
            System.out.println("Число є двозначним i парним.");
        } else {
            System.out.println("Число НЕ є одночасно двозначним i парним.");
        }

        // === 4. Обчислення f(x) згідно з графіком ===
        System.out.println("\n4. Обчислення f(x):");
        System.out.print("Введiть x: ");
        double fx = scanner.nextDouble();
        double result;

        if (fx < -2) {
            result = 1 / Math.tan(fx);  // ctg(x)
        } else if (fx <= 2) {
            result = 9 * Math.pow(fx, 2);
        } else {
            result = Math.pow(Math.sin(fx), 2);
        }

        System.out.println("f(x) = " + result);

        // Закриваємо Scanner після використання
        scanner.close();
    }
}
