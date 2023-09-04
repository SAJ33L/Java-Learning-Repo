package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        double rate = 15;
        double maxHours = 40;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (maxHours < hoursWorked || hoursWorked < 0){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        double grossPay = rate * hoursWorked;
        System.out.println("Gross Pay: " + grossPay);
    }
}
