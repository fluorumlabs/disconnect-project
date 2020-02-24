package js.lang;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;


/**
 * The interface Any.
 */
public interface Any extends JSObject {
	/**
	 * Empty t.
	 *
	 * @param <T> the type parameter
	 *
	 * @return the t
	 */
	@JSBody(script = "return {};")
    static <T extends Any> T empty() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
}
