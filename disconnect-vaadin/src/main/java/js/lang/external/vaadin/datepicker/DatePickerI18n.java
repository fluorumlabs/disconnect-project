package js.lang.external.vaadin.datepicker;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 7/3/2020.
 */
public interface DatePickerI18n extends Any {
    @JSBody(params = "value", script = "this.monthNames = value; return this;")
    DatePickerI18n monthNames(String... value);

    @JSBody(params = "value", script = "this.weekdays = value; return this;")
    DatePickerI18n weekdays(String... value);

    @JSBody(params = "value", script = "this.weekdaysShort = value; return this;")
    DatePickerI18n weekdaysShort(String... value);

    @JSBody(params = "value", script = "this.firstDayOfWeek = value; return this;")
    DatePickerI18n firstDayOfWeek(int value);

    @JSBody(params = "value", script = "this.week = value; return this;")
    DatePickerI18n week(String value);

    @JSBody(params = "value", script = "this.calendar = value; return this;")
    DatePickerI18n calendar(String value);

    @JSBody(params = "value", script = "this.clear = value; return this;")
    DatePickerI18n clear(String value);

    @JSBody(params = "value", script = "this.cancel = value; return this;")
    DatePickerI18n cancel(String value);

    @JSBody(params = "value", script = "this.today = value; return this;")
    DatePickerI18n today(String value);

    @JSBody(params = "value", script = "this.parseDate = value; return this;")
    DatePickerI18n parseDate(DateParser value);

    @JSBody(params = "value", script = "this.formatDate = value; return this;")
    DatePickerI18n formatDate(DateFormatter value);

    @JSBody(params = "value", script = "this.formatTitle = value; return this;")
    DatePickerI18n formatTitle(TitleFormatter value);

    @JSFunctor
    @FunctionalInterface
    interface DateParser extends JSObject{
        @Nullable DatePickerDate parseDate(String date);
    }

    @JSFunctor
    @FunctionalInterface
    interface DateFormatter extends JSObject{
        String formatDate(DatePickerDate date);
    }

    @JSFunctor
    @FunctionalInterface
    interface TitleFormatter extends JSObject{
        String formatTitle(String monthName, int fullYear);
    }


}
