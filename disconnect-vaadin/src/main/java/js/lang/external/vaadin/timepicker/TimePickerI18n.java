package js.lang.external.vaadin.timepicker;

import js.lang.Any;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public interface TimePickerI18n extends Any {
    @JSProperty
    void setClear(String clear);
    
    @JSProperty
    void setSelector(String selector);
    
    @JSProperty
    void setParseTime(Parser parseTime);

    @JSProperty
    void setFormatTime(Formatter formatTime);

    @JSFunctor
    @FunctionalInterface
    interface Parser extends JSObject {
        @Nullable TimePickerTime parseTime(String time);
    }

    @JSFunctor
    @FunctionalInterface
    interface Formatter extends JSObject {
        String formatTime(TimePickerTime time);
    }
}
