package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Provides contains information about a MIME type associated with a particular plugin. NavigatorPlugins.mimeTypes returns an array of this object.
 */
public interface MimeType extends Any {
    @JSBody(script = "return MimeType.prototype")
    static MimeType prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MimeType()")
    static MimeType create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the MIME type's description.
     */
    @JSProperty
    String getDescription();

    /**
     * Returns the Plugin object that implements this MIME type.
     */
    @JSProperty
    Plugin getEnabledPlugin();

    /**
     * Returns the MIME type's typical file extensions, in a comma-separated list.
     */
    @JSProperty
    String getSuffixes();

    /**
     * Returns the MIME type.
     */
    @JSProperty
    String getType();


}
