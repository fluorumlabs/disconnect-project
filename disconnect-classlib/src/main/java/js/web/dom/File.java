package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;

/** Provides information about files and allows JavaScript in a web page to access their content. */
public interface File extends Blob {
    @JSProperty
    double getLastModified();

    @JSProperty
    String getName();

    @JSBody(script = "return File.prototype")
    static File prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"fileBits","fileName","options"}, script = "return new File(fileBits, fileName, options)")
    static File create(@JSByRef BufferSource[] fileBits, String fileName, FilePropertyBag options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params={"fileBits","fileName","options"}, script = "return new File(fileBits, fileName, options)")
    static File create(@JSByRef Blob[] fileBits, String fileName, FilePropertyBag options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params={"fileBits","fileName","options"}, script = "return new File(fileBits, fileName, options)")
    static File create(@JSByRef String[] fileBits, String fileName, FilePropertyBag options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"fileBits","fileName","options"}, script = "return new File(fileBits, fileName, options)")
    static File create(Array<Any> fileBits, String fileName, FilePropertyBag options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"fileBits","fileName"}, script = "return new File(fileBits, fileName)")
    static File create(@JSByRef BufferSource[] fileBits, String fileName) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params={"fileBits","fileName"}, script = "return new File(fileBits, fileName)")
    static File create(@JSByRef Blob[] fileBits, String fileName) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }
    @JSBody(params={"fileBits","fileName"}, script = "return new File(fileBits, fileName)")
    static File create(Array<Any> fileBits, String fileName) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


}
