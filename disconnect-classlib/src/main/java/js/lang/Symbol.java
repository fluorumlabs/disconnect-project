package js.lang;

public interface Symbol extends Any {
    /**
     * Returns a string representation of an object.
     */
    String toString();

    /**
     * Returns the primitive value of the specified object.
     */
    Symbol valueOf();
}
