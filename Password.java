import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Password {

    public static boolean checkNumber(String password) {

        char[] chars = password.toCharArray();

        for (char c : chars) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Invoke a scanner object and create vairiables
        Scanner userInput = new Scanner(System.in);
        boolean passwordCheck = true;
        String firstEntry = "";
        String confirmPassword = "";

        // Prompt the user to enter a password
        System.out.println("Please enter your password");
        // Take input for password
        firstEntry = userInput.nextLine();
        // Promp the user to confirm password
        System.out.println("Please confirm the password");
        confirmPassword = userInput.nextLine();

        try {
            // Create a FileWriter password txt

            FileWriter generatePassword = new FileWriter("./password.txt", true);

            // Confirm password until password is the same
            while (passwordCheck) {

                // if passwords match and are successful save password to a text file

                if (checkNumber(firstEntry) && checkNumber(confirmPassword)) {
                    if (firstEntry.equals(confirmPassword)) {
                        generatePassword
                                .write("Password has been created and the password is " + confirmPassword + "\n");
                        generatePassword.close();
                        passwordCheck = false;
                        // Display output
                        System.out.println("Password successfully saved");
                    } else {
                        System.out.println("Passwords didnt match , enter again");
                        // Prompt the user to enter a password
                        System.out.println("Please enter your password");
                        // Take input for password
                        firstEntry = userInput.nextLine();
                        // Promp the user to confirm password
                        System.out.println("Please confirm the password");
                        confirmPassword = userInput.nextLine();
                    }
                } else {
                    passwordCheck = false;
                    System.out.println("Password requires a number");
                }

            }

        } catch (IOException e) {
            System.out.println(e);
        }

        userInput.close();
    }
}
