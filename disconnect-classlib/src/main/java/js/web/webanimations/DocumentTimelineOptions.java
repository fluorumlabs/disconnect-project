package js.web.webanimations;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface DocumentTimelineOptions extends Any {
    @JSProperty
    double getOriginTime();

    @JSProperty
    void setOriginTime(double originTime);

}
