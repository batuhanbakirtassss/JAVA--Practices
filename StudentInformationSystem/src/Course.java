public class Course {
    Teacher teacher;   // Reference to the teacher of the course
    String name;       // Name of the course
    String code;       // Course code
    String prefix;     // Prefix representing the course department
    double oralWeight; // Weight of oral exam in the overall grade
    int examNote;      // Exam grade
    int oralNote;      // Oral exam grade

    // Constructor to initialize course information and oral weight
    Course(String name, String code, String prefix, double oralWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = null;   // Initialize the teacher as null
        this.examNote = 0;     // Initialize exam grade as 0
        this.oralNote = 0;     // Initialize oral exam grade as 0
        this.oralWeight = oralWeight; // Set the oral exam weight
    }

    // Method to associate a teacher with the course
    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher; // Assign the provided teacher to the course
        } else {
            System.out.println("Teacher and course department do not match!");
        }
    }

    // Method to set exam and oral notes for the course
    void addBulkExamNoteWithOral(int examNote, int oralNote) {
        if (examNote >= 0 && examNote <= 100) {
            this.examNote = examNote;
        }

        if (oralNote >= 0 && oralNote <= 100) {
            this.oralNote = oralNote;
        }
    }

    // Calculate the weighted average considering exam and oral grades
    double calcWeightedAverage() {
        return (this.examNote * (1 - this.oralWeight)) + (this.oralNote * this.oralWeight);
    }

    // Print the details of the associated teacher
    void printTeacher() {
        this.teacher.print();
    }
}
