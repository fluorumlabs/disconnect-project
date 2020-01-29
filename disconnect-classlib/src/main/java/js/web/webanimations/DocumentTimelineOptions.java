package js.web.webanimations;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface DocumentTimelineOptions extends Any {
    @JSProperty
    double getOriginTime();

    @JSProperty
    void setOriginTime(double originTime);

}
