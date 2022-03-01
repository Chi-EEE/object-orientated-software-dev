/**
 *
 * @author C00261172
 */
public class MyInvalidPasswordException extends RuntimeException {
    public MyInvalidPasswordException(String password) {
        super("Password: " + password + " is not strong enough!");
    }
}
