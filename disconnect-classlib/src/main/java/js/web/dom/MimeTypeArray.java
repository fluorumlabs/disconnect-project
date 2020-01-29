package js.web.dom;



import js.util.collections.ArrayLike;
import org.teavm.jso.JSBody;

import javax.annotation.Nullable;

/** Returns an array of MimeType instances, each of which contains information about a supported browser plugins. This object is returned by NavigatorPlugins.mimeTypes. */
        public interface MimeTypeArray extends ArrayLike<MimeType> {

        @Nullable
         MimeType namedItem(String name);

        @JSBody(script = "return MimeTypeArray.prototype")
        static MimeTypeArray prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new MimeTypeArray()")
        static MimeTypeArray create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
