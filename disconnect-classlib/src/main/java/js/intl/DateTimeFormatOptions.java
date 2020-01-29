package js.intl;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface DateTimeFormatOptions extends Any {
    @JSProperty
    @Nullable
    String getLocaleMatcher();

    @JSProperty
    void setLocaleMatcher(String localeMatcher);

    @JSProperty
    @Nullable
    String getWeekday();

    @JSProperty
    void setWeekday(String weekday);

    @JSProperty
    @Nullable
    String getEra();

    @JSProperty
    void setEra(String era);

    @JSProperty
    @Nullable
    String getYear();

    @JSProperty
    void setYear(String year);

    @JSProperty
    @Nullable
    String getMonth();

    @JSProperty
    void setMonth(String month);

    @JSProperty
    @Nullable
    String getDay();

    @JSProperty
    void setDay(String day);

    @JSProperty
    @Nullable
    String getHour();

    @JSProperty
    void setHour(String hour);

    @JSProperty
    @Nullable
    String getMinute();

    @JSProperty
    void setMinute(String minute);

    @JSProperty
    @Nullable
    String getSecond();

    @JSProperty
    void setSecond(String second);

    @JSProperty
    @Nullable
    String getTimeZoneName();

    @JSProperty
    void setTimeZoneName(String timeZoneName);

    @JSProperty
    @Nullable
    String getFormatMatcher();

    @JSProperty
    void setFormatMatcher(String formatMatcher);

    @JSProperty
    boolean isHour12();

    @JSProperty
    void setHour12(boolean hour12);

    @JSProperty
    @Nullable
    String getTimeZone();

    @JSProperty
    void setTimeZone(String timeZone);
}
