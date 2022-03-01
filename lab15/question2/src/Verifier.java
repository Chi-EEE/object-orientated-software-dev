/**
 *
 * @author C00261172
 */
public class Verifier {
    static public void verifyIntRange(int value, int low, int high) throws MyOutOfRangeException{
        if (value < low || value > high) { // If number is outside of the range inputted then throw error
            throw new MyOutOfRangeException(value);
        }
    }
    static public void verifyPasswordStrength(String password) {
        if (password.length() < 8) {
            throw new MyInvalidPasswordException(password);
        }
    }
}
