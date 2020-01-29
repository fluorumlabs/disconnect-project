package js.web.streams;

import js.lang.Any;
import js.web.dom.AbortSignal;
import org.teavm.jso.JSProperty;


public interface PipeOptions extends Any {
    @JSProperty
    boolean isPreventAbort();

    @JSProperty
    void setPreventAbort(boolean preventAbort);

    @JSProperty
    boolean isPreventCancel();

    @JSProperty
    void setPreventCancel(boolean preventCancel);

    @JSProperty
    boolean isPreventClose();

    @JSProperty
    void setPreventClose(boolean preventClose);

    @JSProperty
    AbortSignal getSignal();

    @JSProperty
    void setSignal(AbortSignal signal);

}
