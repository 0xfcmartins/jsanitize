
package pt.fcmartins.utils;

/**
 * Requests validation generic constants
 *
 * @author Francisco Martins
 * @version 1.000.000 @ 19/01/2021
 */
public class Constants {

    /**
     * Generic messages to be used on the validation annotations
     */
    public static class Messages {
        public final static String ID_SIZE = "Field don't match the ID type pattern, and ID must be between 1 and 9!";
        public final static String ID_DECIMAL = "Field don't match the ID type pattern, and ID must have no decimals";
        public final static String GENERIC_DATE = "Field don't match a DD/MM/YYYY pattern!";
    }

    /**
     * Generic patterns to match the ones used on the Oracle DB columns definition (GPE)
     */
    public static class Patterns {
        public final static String GENERIC_DATE = "^\\d{2}/\\d{2}/\\d{4}$";
    }

    /**
     * Generic annotations messages
     */
    public static class Validation {
        public static class Error {
            public static final String NULL_OBJECT = "Validation object is null!";
            public static final Boolean INVALID = false;
            public static final Boolean VALID = true;
        }
    }

    /**
     * Process core utility messages
     */
    public static class Core {
        public static class Error {
            public static final String OBJECT_IS_NULL = "Request object is null!";
        }

        public static final String MESSAGE_STR_PREFIX = "Request object validation result: ";
    }

}
