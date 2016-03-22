
package lab3;

/**
 *
 * @author Carson Schultz
 */
public class IllegalFullNameException extends IllegalArgumentException{
    private static final String ERR_MSG =
            "Sorry full name must consist of first name and last name.";
    
    public IllegalFullNameException() {
        super(ERR_MSG);
    }

    public IllegalFullNameException(String s) {
        super(ERR_MSG);
    }

    public IllegalFullNameException(String message, Throwable cause) {
        super(ERR_MSG, cause);
    }

    public IllegalFullNameException(Throwable cause) {
        super(cause);
    }
    
}
