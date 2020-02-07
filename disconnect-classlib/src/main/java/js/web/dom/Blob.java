package js.web.dom;

import js.lang.Any;
import js.util.collections.Array;
import js.web.canvas.ImageBitmapSource;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

/**
 * A file-like object of immutable, raw data. Blobs represent data that isn't necessarily in a JavaScript-native format. The File interface is based on Blob, inheriting blob functionality and expanding it to support files on the user's system.
 */
public interface Blob extends Any, ImageBitmapSource {
    @JSBody(script = "return Blob.prototype")
    static Blob prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"blobParts", "options"}, script = "return new Blob(blobParts, options)")
    static Blob create(Array<Any> blobParts, BlobPropertyBag options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"blobParts", "options"}, script = "return new Blob(blobParts, options)")
    static Blob create(BufferSource[] blobParts, BlobPropertyBag options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"blobParts", "options"}, script = "return new Blob(blobParts, options)")
    static Blob create(Blob[] blobParts, BlobPropertyBag options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"blobParts", "options"}, script = "return new Blob(blobParts, options)")
    static Blob create(String[] blobParts, BlobPropertyBag options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "blobParts", script = "return new Blob(blobParts)")
    static Blob create(Array<Any> blobParts) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "blobParts", script = "return new Blob(blobParts)")
    static Blob create(BufferSource... blobParts) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "blobParts", script = "return new Blob(blobParts)")
    static Blob create(Blob... blobParts) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "blobParts", script = "return new Blob(blobParts)")
    static Blob create(String... blobParts) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Blob()")
    static Blob create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getSize();

    @JSProperty
    String getType();

    Blob slice(int start, int end, String contentType);

    Blob slice(int start, int end);

    Blob slice(int start);

    Blob slice();

}
