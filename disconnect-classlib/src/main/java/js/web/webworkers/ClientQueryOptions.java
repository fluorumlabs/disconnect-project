package js.web.webworkers;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ClientQueryOptions extends Any {
    @JSProperty
    boolean isIncludeUncontrolled();

    @JSProperty
    void setIncludeUncontrolled(boolean includeUncontrolled);

    @JSProperty
    @Nullable
    ClientTypes getType();

    @JSProperty
    void setType(ClientTypes type);

}
