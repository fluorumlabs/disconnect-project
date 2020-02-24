package js.lang;


/**
 * The type Promise rejection exception.
 */
public class PromiseRejectionException extends Exception {
	/**
	 * Instantiates a new Promise rejection exception.
	 *
	 * @param message the message
	 */
	PromiseRejectionException(String message) {
        super(message);
    }
}
