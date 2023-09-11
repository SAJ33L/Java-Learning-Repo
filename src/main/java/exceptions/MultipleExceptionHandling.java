package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {

    public static void main(String[] args) {

        File file = new File("files/numbers.txt");
//        Scanner fileReader = null;
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }
            fileReader.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
//        finally {
//            fileReader.close();
//        }

    }
}
