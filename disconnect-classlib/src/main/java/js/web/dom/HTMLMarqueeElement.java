package js.web.dom;


import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides methods to manipulate &lt;marquee&gt; elements.
 */
public interface HTMLMarqueeElement extends HTMLElement {
    @JSBody(script = "return HTMLMarqueeElement.prototype")
    static HTMLMarqueeElement prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new HTMLMarqueeElement()")
    static HTMLMarqueeElement create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @Deprecated
    @JSProperty
    String getBehavior();

    @JSProperty
    void setBehavior(String behavior);

    @Deprecated
    @JSProperty
    String getBgColor();

    @JSProperty
    void setBgColor(String bgColor);

    @Deprecated
    @JSProperty
    String getDirection();

    @JSProperty
    void setDirection(String direction);

    @Deprecated
    @JSProperty
    String getHeight();

    @JSProperty
    void setHeight(String height);

    @Deprecated
    @JSProperty
    double getHspace();

    @JSProperty
    void setHspace(double hspace);

    @Deprecated
    @JSProperty
    double getLoop();

    @JSProperty
    void setLoop(double loop);

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOnbounce();

    @Deprecated
    @JSProperty
    void setOnbounce(EventListener<Event> onbounce);

    @Deprecated
    default void addBounceEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("bounce", listener, options);
    }

    @Deprecated
    default void addBounceEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("bounce", listener, options);
    }

    @Deprecated
    default void addBounceEventListener(EventListener<Event> listener) {
        addEventListener("bounce", listener);
    }

    @Deprecated
    default void removeBounceEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("bounce", listener, options);
    }

    @Deprecated
    default void removeBounceEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("bounce", listener, options);
    }

    @Deprecated
    default void removeBounceEventListener(EventListener<Event> listener) {
        removeEventListener("bounce", listener);
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOnfinish();

    @Deprecated
    @JSProperty
    void setOnfinish(EventListener<Event> onfinish);

    @Deprecated
    default void addFinishEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("finish", listener, options);
    }

    @Deprecated
    default void addFinishEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("finish", listener, options);
    }

    @Deprecated
    default void addFinishEventListener(EventListener<Event> listener) {
        addEventListener("finish", listener);
    }

    @Deprecated
    default void removeFinishEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("finish", listener, options);
    }

    @Deprecated
    default void removeFinishEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("finish", listener, options);
    }

    @Deprecated
    default void removeFinishEventListener(EventListener<Event> listener) {
        removeEventListener("finish", listener);
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOnstart();

    @Deprecated
    @JSProperty
    void setOnstart(EventListener<Event> onstart);

    @Deprecated
    default void addStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("start", listener, options);
    }

    @Deprecated
    default void addStartEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("start", listener, options);
    }

    @Deprecated
    default void addStartEventListener(EventListener<Event> listener) {
        addEventListener("start", listener);
    }

    @Deprecated
    default void removeStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("start", listener, options);
    }

    @Deprecated
    default void removeStartEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("start", listener, options);
    }

    @Deprecated
    default void removeStartEventListener(EventListener<Event> listener) {
        removeEventListener("start", listener);
    }

    @Deprecated
    @JSProperty
    double getScrollAmount();

    @JSProperty
    void setScrollAmount(double scrollAmount);

    @Deprecated
    @JSProperty
    double getScrollDelay();

    @JSProperty
    void setScrollDelay(double scrollDelay);

    @Deprecated
    @JSProperty
    boolean isTrueSpeed();

    @JSProperty
    void setTrueSpeed(boolean trueSpeed);

    @Deprecated
    @JSProperty
    double getVspace();

    @JSProperty
    void setVspace(double vspace);

    @Deprecated
    @JSProperty
    String getWidth();

    @JSProperty
    void setWidth(String width);

    @Deprecated
    void start();

    @Deprecated
    void stop();

}
