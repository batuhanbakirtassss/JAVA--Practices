public class RecursiveNumberOperation {
    // Recursive method that follows the given rule
    static void recursiveOperation(int n) {
        // Base case: if n is less than or equal to 0, print the value and return
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        // Print the current value of n before subtraction
        System.out.print(n + " ");
        // Recursively call the method with n - 5 to continue the operation
        recursiveOperation(n - 5);
        // Print the current value of n after subtraction
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        // Test cases
        int n1 = 16;
        System.out.println("N Value: " + n1);
        recursiveOperation(n1);

        int n2 = 10;
        System.out.println("\nN Value: " + n2);
        recursiveOperation(n2);

        int n3 = 25;
        System.out.println("\nN Value: " + n3);
        recursiveOperation(n3);

        int n4 = 5;
        System.out.println("\nN Value: " + n4);
        recursiveOperation(n4);
    }
}