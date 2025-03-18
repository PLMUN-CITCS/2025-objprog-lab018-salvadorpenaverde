
import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        int number = getIntegerInput();
        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }

    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter an integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
        return number;
    }

    public static String checkEvenOrOdd(int number) {
        return number % 2 == 0 ? number + " is an Even number." : number + " is an Odd number.";
    }
} 