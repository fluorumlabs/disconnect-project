package js.lang;

import js.util.collections.ReadonlyArray;
import org.teavm.jso.JSProperty;


/**
 * The interface Template strings array.
 */
public interface TemplateStringsArray extends ReadonlyArray<JsString> {
	/**
	 * Get raw string [ ].
	 *
	 * @return the string [ ]
	 */
	@JSProperty
    String[] getRaw();
}
