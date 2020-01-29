package js.web.webanimations;

import js.lang.Promise;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface Animation extends EventTarget {
    @JSBody(params = {"effect", "timeline"}, script = "return new Animation(type, eventInitDict)")
    static Animation create(AnimationEffect effect, AnimationTimeline timeline) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"effect"}, script = "return new Animation(type)")
    static Animation create(AnimationEffect effect) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Animation()")
    static Animation create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return Animation.prototype")
    static Animation prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    double getCurrentTime();

    @JSProperty
    void setCurrentTime(double currentTime);

    @JSProperty
    @Nullable
    AnimationEffect getEffect();

    @JSProperty
    void setEffect(AnimationEffect effect);

    @JSProperty
    Promise<Animation> getFinished();

    @JSProperty
    String getId();

    @JSProperty
    void setId(String id);

    @JSProperty
    @Nullable
    EventListener<AnimationPlaybackEvent> getOncancel();

    @JSProperty
    void setOncancel(EventListener<AnimationPlaybackEvent> oncancel);

    default void addCancelEventListener(EventListener<AnimationPlaybackEvent> listener, AddEventListenerOptions options) {
        addEventListener("cancel", listener, options);
    }

    default void addCancelEventListener(EventListener<AnimationPlaybackEvent> listener, boolean options) {
        addEventListener("cancel", listener, options);
    }

    default void addCancelEventListener(EventListener<AnimationPlaybackEvent> listener) {
        addEventListener("cancel", listener);
    }

    default void removeCancelEventListener(EventListener<AnimationPlaybackEvent> listener, EventListenerOptions options) {
        removeEventListener("cancel", listener, options);
    }

    default void removeCancelEventListener(EventListener<AnimationPlaybackEvent> listener, boolean options) {
        removeEventListener("cancel", listener, options);
    }

    default void removeCancelEventListener(EventListener<AnimationPlaybackEvent> listener) {
        removeEventListener("cancel", listener);
    }

    @JSProperty
    @Nullable
    EventListener<AnimationPlaybackEvent> getOnfinish();

    @JSProperty
    void setOnfinish(EventListener<AnimationPlaybackEvent> onfinish);

    default void addFinishEventListener(EventListener<AnimationPlaybackEvent> listener, AddEventListenerOptions options) {
        addEventListener("finish", listener, options);
    }

    default void addFinishEventListener(EventListener<AnimationPlaybackEvent> listener, boolean options) {
        addEventListener("finish", listener, options);
    }

    default void addFinishEventListener(EventListener<AnimationPlaybackEvent> listener) {
        addEventListener("finish", listener);
    }

    default void removeFinishEventListener(EventListener<AnimationPlaybackEvent> listener, EventListenerOptions options) {
        removeEventListener("finish", listener, options);
    }

    default void removeFinishEventListener(EventListener<AnimationPlaybackEvent> listener, boolean options) {
        removeEventListener("finish", listener, options);
    }

    default void removeFinishEventListener(EventListener<AnimationPlaybackEvent> listener) {
        removeEventListener("finish", listener);
    }

    @JSProperty
    boolean isPending();

    @JSProperty
    AnimationPlayState getPlayState();

    @JSProperty
    double getPlaybackRate();

    @JSProperty
    void setPlaybackRate(double playbackRate);

    @JSProperty
    Promise<Animation> getReady();

    @JSProperty
    double getStartTime();

    @JSProperty
    void setStartTime(double startTime);

    @JSProperty
    @Nullable
    AnimationTimeline getTimeline();

    @JSProperty
    void setTimeline(AnimationTimeline timeline);

    void cancel();

    void finish();

    void pause();

    void play();

    void reverse();

    void updatePlaybackRate(double playbackRate);

}
