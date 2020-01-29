package js.intl;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;


public abstract class Collator implements Any {
    @JSBody(params = {"locales", "options"}, script = "return new Intl.Collator(locales, options)")
    public static native Collator create(String locales, CollatorOptions options);

    @JSBody(params = {"locales", "options"}, script = "return new Intl.Collator(locales, options)")
    public static native Collator create(@JSByRef String[] locales, CollatorOptions options);

    @JSBody(params = {"locales"}, script = "return new Intl.Collator(locales)")
    public static native Collator create(String locales);

    @JSBody(params = {"locales"}, script = "return new Intl.Collator(locales)")
    public static native Collator create(@JSByRef String[] locales);

    @JSBody(params = {"locales", "options"}, script = "return Intl.Collator.supportedLocalesOf(locales, options)")
    public static native String[] supportedLocalesOf(String locales, CollatorOptions options);

    @JSBody(params = {"locales", "options"}, script = "return Intl.Collator.supportedLocalesOf(locales, options)")
    public static native String[] supportedLocalesOf(@JSByRef String[] locales, CollatorOptions options);

    @JSBody(params = {"locales"}, script = "return Intl.Collator.supportedLocalesOf(locales)")
    public static native String[] supportedLocalesOf(String locales);

    @JSBody(params = {"locales"}, script = "return Intl.Collator.supportedLocalesOf(locales)")
    public static native String[] supportedLocalesOf(@JSByRef String[] locales);

    public native int compare(String x, String y);

    public native ResolvedCollatorOptions resolvedOptions();
}

