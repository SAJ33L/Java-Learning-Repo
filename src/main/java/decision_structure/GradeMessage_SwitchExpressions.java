package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {

        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job";
            case "D" -> "You need to work a bit harder";
            case "F" -> "Uh oh!";
            case "G", "H" -> "This to assign multiple cases a single return";
            case "I" -> {
                message = "none should be printed but it will not because of yield";
                yield "To use yield there must be multiple statements in a case";
            }
            default->"Error. Invalid Grade";
        };
        System.out.println(message);
    }
}
