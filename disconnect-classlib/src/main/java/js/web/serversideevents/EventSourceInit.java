package js.web.serversideevents;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface EventSourceInit extends Any {
    @JSProperty
    boolean isWithCredentials();

    @JSProperty
    void setWithCredentials(boolean withCredentials);

}
