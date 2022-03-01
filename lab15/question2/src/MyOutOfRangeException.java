/**
 *
 * @author C00261172
 */
public class MyOutOfRangeException extends RuntimeException {
    MyOutOfRangeException(int value) {
        super("number " + value + " is out of range");
    }
}
