package js.web.push;

import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.lang.Unknown;


public interface PushSubscriptionOptionsInit extends Any {
    @JSProperty
    @Nullable
    Unknown getApplicationServerKey();

    @JSProperty
    void setApplicationServerKey(BufferSource applicationServerKey);
    @JSProperty
    void setApplicationServerKey(String applicationServerKey);

    @JSProperty
    boolean isUserVisibleOnly();

    @JSProperty
    void setUserVisibleOnly(boolean userVisibleOnly);

}
