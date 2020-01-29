package js.web.webworkers;

import js.lang.Any;
import js.web.fetch.RequestCredentials;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface WorkerOptions extends Any {
    @JSProperty
    @Nullable
    RequestCredentials getCredentials();

    @JSProperty
    void setCredentials(RequestCredentials credentials);

    @JSProperty
    @Nullable
    String getName();

    @JSProperty
    void setName(String name);

    @JSProperty
    @Nullable
    WorkerType getType();

    @JSProperty
    void setType(WorkerType type);

}
