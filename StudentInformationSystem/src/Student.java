public class Student {

    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    // Constructor to initialize student information and courses
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    // Method to set exam and oral notes for each course
    void addBulkExamNoteWithOral(int historyExam, int physicsExam, int biologyExam, int historyOral, int physicsOral, int biologyOral) {
        if (historyExam >= 0 && historyExam <= 100) {
            this.c1.examNote = historyExam;
        }

        if (physicsExam >= 0 && physicsExam <= 100) {
            this.c2.examNote = physicsExam;
        }

        if (biologyExam >= 0 && biologyExam <= 100) {
            this.c3.examNote = biologyExam;
        }

        if (historyOral >= 0 && historyOral <= 100) {
            this.c1.oralNote = historyOral;
        }

        if (physicsOral >= 0 && physicsOral <= 100) {
            this.c2.oralNote = physicsOral;
        }

        if (biologyOral >= 0 && biologyOral <= 100) {
            this.c3.oralNote = biologyOral;
        }
    }

    // Method to check if the student passes or fails
    void isPass() {
        System.out.println("====================");
        // Calculate the weighted average of courses and check if it's above the passing threshold
        this.average = (this.c1.calcWeightedAverage() + this.c2.calcWeightedAverage() + this.c3.calcWeightedAverage()) / 3.0;
        if (this.average > 55) {
            System.out.println("You have successfully passed the class.");
            this.isPass = true;
        } else {
            System.out.println("You have failed the class!");
            this.isPass = false;
        }

        printNote();
    }

    // Method to print the exam and oral notes along with the average
    void printNote() {
        System.out.println(this.c1.name + " Exam Grade\t\t:" + this.c1.examNote);
        System.out.println(this.c2.name + " Exam Grade\t\t:" + this.c2.examNote);
        System.out.println(this.c3.name + " Exam Grade\t:" + this.c3.examNote);
        System.out.println("Your Average: " + this.average);
    }
}
