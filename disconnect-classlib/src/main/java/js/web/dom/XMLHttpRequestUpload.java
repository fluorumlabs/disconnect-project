package js.web.dom;

import org.teavm.jso.JSBody;


public interface XMLHttpRequestUpload extends XMLHttpRequestEventTarget {
            @JSBody(script = "return XMLHttpRequestUpload.prototype")
            static XMLHttpRequestUpload prototype() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }

            @JSBody(script = "return new XMLHttpRequestUpload()")
            static XMLHttpRequestUpload create() {
                throw new UnsupportedOperationException("Available only in JavaScript");
            }

        }
