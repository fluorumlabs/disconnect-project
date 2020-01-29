package js.web.webanimations;


import js.web.dom.Event;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;


public interface AnimationPlaybackEvent extends Event {
    @JSProperty
    double  getCurrentTime();

    @JSProperty
    double  getTimelineTime();

    @JSBody(script = "return AnimationPlaybackEvent.prototype")
    static AnimationPlaybackEvent prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params={"type","eventInitDict"}, script = "return new AnimationPlaybackEvent(type, eventInitDict)")
    static AnimationPlaybackEvent create(String type, AnimationPlaybackEventInit eventInitDict) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params="type", script = "return new AnimationPlaybackEvent(type)")
    static AnimationPlaybackEvent create(String type) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }


    interface AnimationPlaybackEventInit extends EventInit {
        @JSProperty
        double getCurrentTime();

        @JSProperty
        void setCurrentTime(double currentTime);

        @JSProperty
        double getTimelineTime();

        @JSProperty
        void setTimelineTime(double timelineTime);

    }
}
