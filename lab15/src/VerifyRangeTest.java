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
            int value = scanner.nextInt();
            Verifier.verifyIntRange(value, 1, 100); // Between 1 - 100
        } catch (MyOutOfRangeException errorException) {
            System.out.println(errorException);
        }
        System.out.println("Press Any Key To Continue...");
        scanner.nextLine();
    }

}
