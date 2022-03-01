/**
 *
 * @author C00261172
 */
public class Verifier {
    static public void verifyIntRange(int value, int low, int high) throws MyOutOfRangeException{
        if (value < low || value > high) { // If number is outside of the range inputted then throw error
            throw new MyOutOfRangeException("number " + value + " is out of range");
        }
    }
}
