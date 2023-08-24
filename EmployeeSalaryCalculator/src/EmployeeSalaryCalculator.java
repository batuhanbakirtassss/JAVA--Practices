import java.util.Scanner;

public class EmployeeSalaryCalculator {
    private String name;         // Employee's name
    private double salary;       // Employee's base salary
    private int workHours;       // Weekly work hours
    private int hireYear;        // Year of employment

    // Constructor to initialize employee attributes
    public EmployeeSalaryCalculator(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Method to calculate tax based on salary
    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Method to calculate bonus based on extra work hours
    public double bonus() {
        int extraHours = Math.max(workHours - 40, 0);
        return extraHours * 30;
    }

    // Method to calculate salary increase based on years worked
    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    // Method to print employee information with calculated values
    public void printEmployeeInfo() {
        double totalSalary = salary - tax() + bonus() + raiseSalary();

        // Print employee information
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Work Hours: " + workHours);
        System.out.println("Hire Year: " + hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary Increase: " + raiseSalary());
        System.out.println("Salary with Tax and Bonuses: " + totalSalary);
        System.out.println("Total Salary: " + (salary + raiseSalary()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get employee details from the user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your weekly work hours: ");
        int workHours = scanner.nextInt();

        System.out.print("Enter your hire year: ");
        int hireYear = scanner.nextInt();

        // Create an EmployeeSalaryCalculator instance
        EmployeeSalaryCalculator employee = new EmployeeSalaryCalculator(name, salary, workHours, hireYear);

        // Print employee information with calculated values
        employee.printEmployeeInfo();
    }
}