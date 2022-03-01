import java.util.Scanner;

/**
 * @author C00261172 Huu Chi Huynh
 * @date 01/03/2022
 * @summary
 * Checks if number is between 1 and 100 and throws an exception if the value inputted is out of range.
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
        } catch (NumberFormatException | MyOutOfRangeException exception) {
            System.out.println(exception);
        }
    }

}
