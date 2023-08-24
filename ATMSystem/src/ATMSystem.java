import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3; // Number of login attempts allowed
        int balance = 1500; // Initial account balance
        int select;

        while (right > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();
            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to Kodluyoruz Bank!");

                do {
                    System.out.println("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Check Balance\n" +
                            "4-Exit");
                    System.out.print("Please select an operation: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Enter the deposit amount: ");
                            int depositAmount = input.nextInt();
                            balance += depositAmount; // Add deposit amount to the balance
                            break;
                        case 2:
                            System.out.print("Enter the withdrawal amount: ");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= withdrawAmount; // Deduct withdrawal amount from the balance
                            }
                            break;
                        case 3:
                            System.out.println("Your balance: " + balance);
                            break;
                        case 4:
                            System.out.println("Thank you. Goodbye!");
                            break;
                        default:
                            System.out.println("Invalid option selected.");
                            break;
                    }
                } while (select != 4);

                break;
            } else {
                right--;
                System.out.println("Invalid username or password. Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Remaining attempts: " + right);
                }
            }
        }
    }
}