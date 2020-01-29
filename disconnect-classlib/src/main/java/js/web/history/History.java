package js.web.history;

import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * Allows manipulation of the browser session history, that is the pages visited in the tab or frame that the current page is loaded in.
 */
public interface History extends Any {
    @JSBody(script = "return History.prototype")
    static History prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new History()")
    static History create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    int getLength();

    @JSProperty
    ScrollRestoration getScrollRestoration();

    @JSProperty
    void setScrollRestoration(ScrollRestoration scrollRestoration);

    @JSProperty
    Unknown getState();

    void back();

    void forward();

    void go(int delta);

    void go();

    void pushState(Any data, String title, String url);

    void pushState(Any data, String title);

    void replaceState(Any data, String title, String url);

    void replaceState(Any data, String title);

}
