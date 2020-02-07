package js.intl;

import js.lang.Any;
import js.lang.JsDate;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;


public abstract class DateTimeFormat implements Any {
    @JSBody(params = {"locales", "options"}, script = "return new Intl.DateTimeFormat(locales, options)")
    public static native DateTimeFormat create(String locales, DateTimeFormatOptions options);

    @JSBody(params = {"locales", "options"}, script = "return new Intl.DateTimeFormat(locales, options)")
    public static native DateTimeFormat create(String[] locales, DateTimeFormatOptions options);

    @JSBody(params = {"locales"}, script = "return new Intl.DateTimeFormat(locales)")
    public static native DateTimeFormat create(String locales);

    @JSBody(params = {"locales"}, script = "return new Intl.DateTimeFormat(locales)")
    public static native DateTimeFormat create(String[] locales);

    @JSBody(params = {"locales", "options"}, script = "return Intl.DateTimeFormat.supportedLocalesOf(locales, options)")
    public static native String[] supportedLocalesOf(String locales, DateTimeFormatOptions options);

    @JSBody(params = {"locales", "options"}, script = "return Intl.DateTimeFormat.supportedLocalesOf(locales, options)")
    public static native String[] supportedLocalesOf(String[] locales, DateTimeFormatOptions options);

    @JSBody(params = {"locales"}, script = "return Intl.DateTimeFormat.supportedLocalesOf(locales)")
    public static native String[] supportedLocalesOf(String locales);

    @JSBody(params = {"locales"}, script = "return Intl.DateTimeFormat.supportedLocalesOf(locales)")
    public static native String[] supportedLocalesOf(String[] locales);

    public native String format(int value);

    public native String format(JsDate value);

    public native ResolvedDateTimeFormatOptions resolvedOptions();
}

