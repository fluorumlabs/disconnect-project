package js.web.webworkers;

import js.lang.Any;
import js.web.fetch.RequestCredentials;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface WorkletOptions extends Any {
    @JSProperty
    @Nullable
    RequestCredentials getCredentials();

    @JSProperty
    void setCredentials(RequestCredentials credentials);

}
