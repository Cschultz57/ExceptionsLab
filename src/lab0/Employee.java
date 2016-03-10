package lab0;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid.
 * <p>
 * For example, String arguments may be null or empty; other objects may be
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all arguments
 * are valid. The only exception is when any argument is acceptable based on
 * requirements. Fix the code below using if logic to validate method arguments
 * and throw IllegalArgumentException or a custom exception if the validation
 * fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;
    private final int MIN_VACATION = 0;
    private final int MAX_VACATION = 15;
    private final int MIN_NAME_LENGTH = 2;
    private final int MAX_NAME_LENGTH = 20;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }

    public final int getDaysVacation() {
        return daysVacation;
    }

    // must be more than 0 and less than 16
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation <= MIN_VACATION || daysVacation > MAX_VACATION) {
            throw new IllegalArgumentException("Sorry vacations must be longer than 0 days and shorter than 16.");
        }
        this.daysVacation = daysVacation;
    }

    public final String getFirstName() {
        return firstName;
    }

    // must not be null or empty and must be longer than 2 characters and less than 20
    public final void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName == null || firstName.isEmpty() || firstName.length() > MAX_NAME_LENGTH || firstName.length() <= MIN_NAME_LENGTH) {
            throw new IllegalArgumentException("Sorry the first name must be mandatory and greater than 3 characters but less than 20.");
        }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    //must not be null or empty and must be longer than 2 but less than 20 characters
    public final void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName == null || lastName.isEmpty() || lastName.length() > MAX_NAME_LENGTH || lastName.length() <= MIN_NAME_LENGTH) {
            throw new IllegalArgumentException("Sorry the last name must be mandatory and greater than 3 characters but less than 20.");
        }

        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    // needs validation but not required for this lab due to being overly complicated
    public final void setSsn(String ssn) {

        this.ssn = ssn;
    }

}
