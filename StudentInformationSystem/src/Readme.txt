Student Course Management System
This Java program simulates a Student Course Management System where students can enroll in courses, take exams, and receive grades. The system calculates weighted averages based on both exam and oral scores to determine if students pass their courses.

Features
Students: Students are represented with their names, student numbers, and enrolled courses.
Courses: Courses have names, course codes, and assigned teachers. Each course also has a weight assigned to the oral component.
Teachers: Teachers have names, department branches, and contact phone numbers.
Usage
Teacher Information: Initialize teacher objects with their name, department, and contact number.

Course Information: Create course objects with their name, course code, department prefix, and oral weight.

Enroll Students: Create student objects by providing their name, student number, enrolled courses, and class. Use the addBulkExamNoteWithOral method to add exam and oral scores for each course.

Calculate Grades: The system calculates the weighted average for each student's courses and determines if they pass based on a threshold.

Display Results: The program prints out student names, course names, exam and oral scores, and the final average. It also indicates if a student passes or fails.