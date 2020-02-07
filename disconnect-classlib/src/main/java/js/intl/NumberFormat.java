package js.intl;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;


public abstract class NumberFormat implements Any {
    @JSBody(params = {"locales", "options"}, script = "return new Intl.NumberFormat(locales, options)")
    public static native NumberFormat create(String locales, NumberFormatOptions options);

    @JSBody(params = {"locales", "options"}, script = "return new Intl.NumberFormat(locales, options)")
    public static native NumberFormat create(String[] locales, NumberFormatOptions options);

    @JSBody(params = {"locales"}, script = "return new Intl.NumberFormat(locales)")
    public static native NumberFormat create(String locales);

    @JSBody(params = {"locales"}, script = "return new Intl.NumberFormat(locales)")
    public static native NumberFormat create(String[] locales);

    @JSBody(params = {"locales", "options"}, script = "return Intl.NumberFormat.supportedLocalesOf(locales, options)")
    public static native String[] supportedLocalesOf(String locales, NumberFormatOptions options);

    @JSBody(params = {"locales", "options"}, script = "return Intl.NumberFormat.supportedLocalesOf(locales, options)")
    public static native String[] supportedLocalesOf(String[] locales, NumberFormatOptions options);

    @JSBody(params = {"locales"}, script = "return Intl.NumberFormat.supportedLocalesOf(locales)")
    public static native String[] supportedLocalesOf(String locales);

    @JSBody(params = {"locales"}, script = "return Intl.NumberFormat.supportedLocalesOf(locales)")
    public static native String[] supportedLocalesOf(String[] locales);

    public native String format(byte value);

    public native String format(short value);

    public native String format(int value);

    public native String format(float value);

    public native String format(double value);

    public native ResolvedNumberFormatOptions resolvedOptions();
}

