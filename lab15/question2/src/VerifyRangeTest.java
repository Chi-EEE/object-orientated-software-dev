import java.util.Scanner;

/**
 * @author C00261172 Huu Chi Huynh
 * @date 01/03/2022
 * @summary
 * Checks if number is between 1 and 100 and throws an exception if the value inputted is out of range.
 * Also check if password inputted, if the password length is below 8 then throw error..
 */
public class VerifyRangeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please enter an integer:");
            int value = Integer.parseInt(scanner.nextLine());
            Verifier.verifyIntRange(value, 1, 100); // Between 1 - 100
            System.out.println("Please enter a password:");
            String password = scanner.nextLine();
            Verifier.verifyPasswordStrength(password); // Check if password length is below 8
            System.out.println("Good password.");
        } catch (NumberFormatException | MyOutOfRangeException | MyInvalidPasswordException exception) {
            System.out.println(exception);
        }
    }

}
