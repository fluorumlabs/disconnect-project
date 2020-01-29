package js.web.dom;


import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides information about a browser plugin.
 */
@Deprecated
public interface Plugin extends ArrayLike<MimeType> {
    @JSBody(script = "return Plugin.prototype")
    static Plugin prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Plugin()")
    static Plugin create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the plugin's description.
     */
    @JSProperty
    String getDescription();

    /**
     * Returns the plugin library's filename, if applicable on the current platform.
     */
    @JSProperty
    String getFilename();

    /**
     * Returns the number of MIME types, represented by MimeType objects, supported by the plugin.
     */
    @JSProperty
    int getLength();

    /**
     * Returns the plugin's name.
     */
    @JSProperty
    String getName();

    /**
     * Returns the specified MimeType object.
     */
    @Nullable
    MimeType item(int index);

    @Nullable
    MimeType namedItem(String name);

}
