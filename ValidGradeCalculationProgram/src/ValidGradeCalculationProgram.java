import java.util.Scanner;

public class ValidGradeCalculationProgram {
    public static void main(String[] args){
        int mathematics, physics, turkish, chemistry, music;
        int gradeCount = 0;  // keep track of how many valid grades have been entered
        double totalGrade = 0;  // keep track of the sum of all valid grades

        Scanner input = new Scanner(System.in);

        // Prompt user for each subject grade
        System.out.print("Mathematics grade: ");
        mathematics = input.nextInt();
        // Check if the grade is valid (between 0 and 100) and add to total and grade count if so
        if (mathematics >= 0 && mathematics <= 100) {
            totalGrade += mathematics;
            gradeCount++;
        }

        System.out.print("Physics grade: ");
        physics = input.nextInt();
        if (physics >= 0 && physics <= 100) {
            totalGrade += physics;
            gradeCount++;
        }

        System.out.print("Turkish grade: ");
        turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            totalGrade += turkish;
            gradeCount++;
        }

        System.out.print("Chemistry grade: ");
        chemistry = input.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            totalGrade += chemistry;
            gradeCount++;
        }

        System.out.print("Music grade: ");
        music = input.nextInt();
        if (music >= 0 && music <= 100) {
            totalGrade += music;
            gradeCount++;
        }

        // If no valid grades were entered, print an error message and exit the program
        if (gradeCount == 0) {
            System.out.println("Invalid input: No valid grades entered.");
            return;
        }

        // Calculate the average of all valid grades
        double average = totalGrade / gradeCount;

        // Check if the average is below passing grade (55) and print appropriate message
        if (average <= 55){
            System.out.println("You have failed the course. See you next year!");
        } else {
            System.out.println("Congratulations, you have passed the course!");
        }

        // Print the calculated average
        System.out.println("Your average grade is: " + average);
    }
}