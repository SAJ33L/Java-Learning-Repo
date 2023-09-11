package exceptions;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;

public class ThrowingExceptions {

    public static double calculatePay(double hours, double payRate) throws NegativeInputException{

        if (hours > 40 ){
            throw new NegativeInputException();
        } else if (hours < 0 || payRate < 0) {
            throw new NegativeInputException();
        }

        return hours * payRate;
    }

    public static void reThrowMultipleException() throws IOException, InputMismatchException {

        File file = new File("nonexistent.txt");
        file.createNewFile();
    }
    public static void reThrowException() throws Exception{

        File file = new File("nonexistent.txt");
        file.createNewFile();
    }
}
