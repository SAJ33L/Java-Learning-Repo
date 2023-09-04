package loops;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        int numberOfStudents = 24;
        int numberOfTest = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i< numberOfStudents; i++){

            double total = 0;

            for (int j=0; j< numberOfTest; j++){
                System.out.println("Score for tet #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfTest;
            System.out.println("The average for student #" + (i+1) + " is " + average);
        }

        scanner.close();
    }
}
