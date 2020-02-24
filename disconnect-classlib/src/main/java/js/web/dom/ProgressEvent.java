package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Events measuring progress of an underlying process, like an HTTP request (for an XMLHttpRequest, or the loading of the underlying resource of an &lt;img&gt;, &lt;audio&gt;, &lt;video&gt;, &lt;style&gt; or &lt;link&gt;).
 */
public interface ProgressEvent<T extends EventTarget> extends Event {
    @JSBody(script = "return ProgressEvent.prototype")
    static ProgressEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"type", "eventInitDict"}, script = "return new ProgressEvent(type, eventInitDict)")
    static ProgressEvent create(String type, ProgressEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "type", script = "return new ProgressEvent(type)")
    static ProgressEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    boolean isLengthComputable();

    @JSProperty
    int getLoaded();

    @JSProperty
    @Nullable
    T getTarget();

    @JSProperty
    int getTotal();


    interface ProgressEventInit extends EventInit {
        @JSProperty
        boolean isLengthComputable();

        @JSProperty
        void setLengthComputable(boolean lengthComputable);

        @JSProperty
        int getLoaded();

        @JSProperty
        void setLoaded(int loaded);

        @JSProperty
        int getTotal();

        @JSProperty
        void setTotal(int total);

    }
}
