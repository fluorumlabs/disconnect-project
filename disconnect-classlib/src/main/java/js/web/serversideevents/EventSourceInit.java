package js.web.serversideevents;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface EventSourceInit extends Any {
    @JSProperty
    boolean isWithCredentials();

    @JSProperty
    void setWithCredentials(boolean withCredentials);

}
