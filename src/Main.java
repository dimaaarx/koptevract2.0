 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intValue = inputInt(scanner, "Введіть ціле число(int): ");
        double doubleValue = inputDouble(scanner, "Введіть число з плаваючою точкою(float/double): ");
        String stringValue = inputString(scanner, "Введіть строку(string): ");
        boolean boolValue = inputBoolean(scanner, "Введіть логічне значення(boolean): ");

        displayApproach1(intValue, doubleValue, stringValue, boolValue);
        displayApproach2(intValue, doubleValue, stringValue, boolValue);
        displayApproach3(intValue, doubleValue, stringValue, boolValue);
    }

    private static int inputInt(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    private static double inputDouble(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    private static String inputString(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.next();
    }

    private static boolean inputBoolean(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextBoolean();
    }

    private static void displayApproach1(int intValue, double doubleValue, String stringValue, boolean boolValue) {
        System.out.println("\nВиведення даних у різних форматах:");
        System.out.println("\n 1 підхід");
        System.out.println("Ціле число (десяткова система): " + intValue);
        System.out.println("Число з плаваючою точкою: " + doubleValue);
        System.out.println("Строка: " + stringValue);
        System.out.println("Логічне значення: " + boolValue);
    }

    private static void displayApproach2(int intValue, double doubleValue, String stringValue, boolean boolValue) {
        System.out.println("\n2 підхід");
        System.out.printf("Ціле число (десяткова система): %d%n", intValue);
        System.out.printf("Ціле число (шістнадцяткова система): %x%n", intValue);
        System.out.printf("Ціле число (вісімкова система): %o%n", intValue);
        System.out.printf("Число з плаваючою точкою(3 символи після коми): %.3f%n", doubleValue);
        System.out.printf("Строка (до 6 символів): %.6s%n", stringValue);
        System.out.printf("Логічне значення: %b%n", boolValue);
    }

    private static void displayApproach3(int intValue, double doubleValue, String stringValue, boolean boolValue) {
        System.out.println("\n3 підхід");
        System.out.printf("Ціле число (десяткова система): %d%n", intValue);
        System.out.printf("Ціле число (шістнадцяткова система): %x%n", intValue);
        System.out.printf("Ціле число (вісімкова система): %o%n", intValue);
        System.out.printf("Число з плаваючою точкою(2 символи після коми): %.2f%n", doubleValue);
        System.out.printf("Строка (до 4 символів): %.4s%n", stringValue);
        System.out.printf("Логічне значення: %b%n", boolValue);
    }
}