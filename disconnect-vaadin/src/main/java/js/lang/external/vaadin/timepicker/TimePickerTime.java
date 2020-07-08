package js.lang.external.vaadin.timepicker;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public interface TimePickerTime extends Any {
    @JSProperty
    Unknown getHours();
    
    @JSProperty
    void setHours(Unknown hours);
    
    @JSProperty
    Unknown getMinutes();
    
    @JSProperty
    void setMinutes(Unknown minutes);
    
    @JSProperty
    Unknown getSeconds();
    
    @JSProperty
    void setSeconds(Unknown seconds);
    
    @JSProperty
    Unknown getMilliseconds();
    
    @JSProperty
    void setMilliseconds(Unknown milliseconds);
}
