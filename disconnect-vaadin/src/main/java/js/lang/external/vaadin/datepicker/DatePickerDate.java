package js.lang.external.vaadin.datepicker;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public interface DatePickerDate extends Any {
    @JSProperty
    int getDay();
    
    @JSProperty
    void setDay(int day);
    
    @JSProperty
    int getMonth();
    
    @JSProperty
    void setMonth(int month);

    @JSProperty
    int getYear();

    @JSProperty
    void setYear(int year);
}
