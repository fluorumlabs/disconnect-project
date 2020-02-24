package js.lang;

/**
 * The interface Symbol.
 */
public interface Symbol extends Any {
    /**
     * Returns a string representation of an object.
     */
    String toString();

	/**
	 * Returns the primitive value of the specified object.
	 *
	 * @return the symbol
	 */
	Symbol valueOf();
}
