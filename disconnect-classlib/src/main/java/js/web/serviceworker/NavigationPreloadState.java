package js.web.serviceworker;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface NavigationPreloadState extends Any {
    @JSProperty
    boolean isEnabled();

    @JSProperty
    void setEnabled(boolean enabled);

    @JSProperty
    @Nullable
    String getHeaderValue();

    @JSProperty
    void setHeaderValue(String headerValue);

}
