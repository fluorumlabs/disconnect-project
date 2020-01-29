package js.web.webaudio;

import org.teavm.jso.JSProperty;

import js.lang.Any;


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
