package js.intl;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ResolvedDateTimeFormatOptions extends Any {
    @JSProperty
    String getLocale();

    @JSProperty
    void setLocale(String locale);

    @JSProperty
    String getCalendar();

    @JSProperty
    void setCalendar(String calendar);

    @JSProperty
    String getNumberingSystem();

    @JSProperty
    void setNumberingSystem(String numberingSystem);

    @JSProperty
    String getTimeZone();

    @JSProperty
    void setTimeZone(String timeZone);

    @JSProperty
    boolean isHour12();

    @JSProperty
    void setHour12(boolean hour12);

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
}
