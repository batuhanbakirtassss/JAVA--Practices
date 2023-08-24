public class Main {
    public static void main(String[] args) {

        // Create teacher objects
        Teacher t1 = new Teacher("Halil İnalcık", "HIS", "0 512 123 1234");
        Teacher t2 = new Teacher("Nikola Tesla", "PHY", "0 523 234 2345");
        Teacher t3 = new Teacher("James Watson", "BIO", "0 534 345 3456");

        // Create course objects with their respective oral note weights
        Course history = new Course("History", "101", "HIS", 0.20); // Oral note weight is 20%
        history.addTeacher(t1);

        Course physics = new Course("Physics", "102", "PHY", 0.80); // Oral note weight is 80%
        physics.addTeacher(t2);

        Course biology = new Course("Biology", "103", "BIO", 0.60); // Oral note weight is 60%
        biology.addTeacher(t3);

        // Create student objects
        Student student1 = new Student("Batuhan Bakirtas", "201", "1", history, physics, biology);
        student1.addBulkExamNoteWithOral(100, 80, 90, 70, 60, 80); // Set exam and oral notes
        student1.isPass(); // Check if the student passed or not

        Student student2 = new Student("Isaac Newton", "202", "1", history, physics, biology);
        student2.addBulkExamNoteWithOral(80, 100, 100, 50, 90, 75); // Set exam and oral notes
        student2.isPass(); // Check if the student passed or not
    }
}
