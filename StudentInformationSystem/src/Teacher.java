public class Teacher {

    String name;    // Name of the teacher
    String mpno;    // Teacher's phone number
    String branch;  // Department of the teacher

    // Constructor to initialize teacher information
    Teacher(String name, String branch, String mpno) {
        this.name = name;     // Initialize teacher's name
        this.mpno = mpno;     // Initialize teacher's phone number
        this.branch = branch; // Initialize teacher's department
    }

    // Method to print teacher details
    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone Number: " + this.mpno);
        System.out.println("Department: " + this.branch);
    }
}
