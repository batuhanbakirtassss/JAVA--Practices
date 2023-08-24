import java.util.Scanner;

public class PasswordResetandVerificationProgram {
    public static void main(String[] args) {
        // declare variables
        String userName, password, resetPassword;

        // create a Scanner object to read user input
        Scanner inp = new Scanner(System.in);

        // prompt the user to enter their username
        System.out.print("Username: ");
        userName = inp.nextLine();

        // prompt the user to enter their password
        System.out.print("Password: ");
        password = inp.nextLine();

        // check if the username and password match the expected values
        if (userName.equals("batuhanbakirtass") && password.equals("batuhan1234")) {
            System.out.println("You are logged in!");
        } else {
            System.out.println("Invalid credentials!");

            // ask the user if they want to reset their password
            System.out.print("Would you like to reset your password? (Y/N): ");
            String resetChoice = inp.nextLine();

            if (resetChoice.equalsIgnoreCase("Y")) {
                // prompt the user to enter their new password
                System.out.print("Enter your new password: ");
                resetPassword = inp.nextLine();

                // check if the new password is the same as the old password or the default password
                if (resetPassword.equals(password) || resetPassword.equals("jack1234")) {
                    System.out.println("Password creation failed, please choose another password.");
                } else {
                    // set the password to the new password
                    password = resetPassword;
                    System.out.println("Password created successfully.");
                }
            }
        }
    }
}