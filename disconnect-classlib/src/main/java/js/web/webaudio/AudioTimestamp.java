package js.web.webaudio;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface AudioTimestamp extends Any {
    @JSProperty
    double getContextTime();

    @JSProperty
    void setContextTime(double contextTime);

    @JSProperty
    double getPerformanceTime();

    @JSProperty
    void setPerformanceTime(double performanceTime);

}
