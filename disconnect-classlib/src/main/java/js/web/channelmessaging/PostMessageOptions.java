package js.web.channelmessaging;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PostMessageOptions extends Any {
    @JSProperty
    @Nullable
    Array<Any> getTransfer();

    @JSProperty
    void setTransfer(Any... transfer);

    @JSProperty
    void setTransfer(Array<Any> transfer);

}
