package js.web.webrtc;

import js.util.collections.Array;
import js.web.dom.AddEventListenerOptions;
import js.web.dom.Event;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 1/22/2020.
 */
public interface RTCIceGatherer extends RTCStatsProvider {
    @JSBody(script = "return RTCIceGatherer.prototype")
    static RTCIceGatherer prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "options", script = "return new RTCIceGatherer(options)")
    static RTCIceGatherer create(RTCIceGatherOptions options) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    RTCIceComponent getComponent();

    @JSProperty
    @Nullable
    EventListener<Event> getOnerror();

    @JSProperty
    void setOnerror(EventListener<Event> onerror);

    default void addErrorEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("error", listener, options);
    }

    default void addErrorEventListener(EventListener<Event> listener) {
        addEventListener("error", listener);
    }

    default void removeErrorEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("error", listener, options);
    }

    default void removeErrorEventListener(EventListener<Event> listener) {
        removeEventListener("error", listener);
    }

    @JSProperty
    @Nullable
    EventListener<RTCIceGathererEvent> getOnlocalcandidate();

    @JSProperty
    void setOnlocalcandidate(EventListener<RTCIceGathererEvent> onlocalcandidate);

    default void addLocalCandidateEventListener(EventListener<RTCIceGathererEvent> listener, AddEventListenerOptions options) {
        addEventListener("localcandidate", listener, options);
    }

    default void addLocalCandidateEventListener(EventListener<RTCIceGathererEvent> listener, boolean options) {
        addEventListener("localcandidate", listener, options);
    }

    default void addLocalCandidateEventListener(EventListener<RTCIceGathererEvent> listener) {
        addEventListener("localcandidate", listener);
    }

    default void removeLocalCandidateEventListener(EventListener<RTCIceGathererEvent> listener, EventListenerOptions options) {
        removeEventListener("localcandidate", listener, options);
    }

    default void removeLocalCandidateEventListener(EventListener<RTCIceGathererEvent> listener, boolean options) {
        removeEventListener("localcandidate", listener, options);
    }

    default void removeLocalCandidateEventListener(EventListener<RTCIceGathererEvent> listener) {
        removeEventListener("localcandidate", listener);
    }

    RTCIceGatherer createAssociatedGatherer();

    Array<RTCIceCandidateDictionary> getLocalCandidates();

    RTCIceParameters getLocalParameters();

}
