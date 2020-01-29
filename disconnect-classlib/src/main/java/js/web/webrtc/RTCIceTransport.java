package js.web.webrtc;

import js.util.collections.Array;
import js.web.dom.*;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Provides access to information about the ICE transport layer over which the data is being sent and received.
 */
public interface RTCIceTransport extends EventTarget {
    @JSBody(script = "return RTCIceTransport.prototype")
    static RTCIceTransport prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new RTCIceTransport()")
    static RTCIceTransport create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    RTCIceComponent getComponent();

    @JSProperty
    RTCIceGathererState getGatheringState();

    @JSProperty
    @Nullable
    EventListener<Event> getOngatheringstatechange();

    @JSProperty
    void setOngatheringstatechange(EventListener<Event> ongatheringstatechange);

    default void addGatheringStateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("gatheringstatechange", listener, options);
    }

    default void addGatheringStateChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("gatheringstatechange", listener, options);
    }

    default void addGatheringStateChangeEventListener(EventListener<Event> listener) {
        addEventListener("gatheringstatechange", listener);
    }

    default void removeGatheringStateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("gatheringstatechange", listener, options);
    }

    default void removeGatheringStateChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("gatheringstatechange", listener, options);
    }

    default void removeGatheringStateChangeEventListener(EventListener<Event> listener) {
        removeEventListener("gatheringstatechange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnselectedcandidatepairchange();

    @JSProperty
    void setOnselectedcandidatepairchange(EventListener<Event> onselectedcandidatepairchange);

    default void addSelectedCandidatePairChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("selectedcandidatepairchange", listener, options);
    }

    default void addSelectedCandidatePairChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("selectedcandidatepairchange", listener, options);
    }

    default void addSelectedCandidatePairChangeEventListener(EventListener<Event> listener) {
        addEventListener("selectedcandidatepairchange", listener);
    }

    default void removeSelectedCandidatePairChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("selectedcandidatepairchange", listener, options);
    }

    default void removeSelectedCandidatePairChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("selectedcandidatepairchange", listener, options);
    }

    default void removeSelectedCandidatePairChangeEventListener(EventListener<Event> listener) {
        removeEventListener("selectedcandidatepairchange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnstatechange();

    @JSProperty
    void setOnstatechange(EventListener<Event> onstatechange);

    default void addStateChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("statechange", listener, options);
    }

    default void addStateChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("statechange", listener, options);
    }

    default void addStateChangeEventListener(EventListener<Event> listener) {
        addEventListener("statechange", listener);
    }

    default void removeStateChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("statechange", listener, options);
    }

    default void removeStateChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("statechange", listener, options);
    }

    default void removeStateChangeEventListener(EventListener<Event> listener) {
        removeEventListener("statechange", listener);
    }

    @JSProperty
    RTCIceRole getRole();

    @JSProperty
    RTCIceTransportState getState();

    Array<RTCIceCandidate> getLocalCandidates();

    @Nullable
    RTCIceParameters getLocalParameters();

    Array<RTCIceCandidate> getRemoteCandidates();

    @Nullable
    RTCIceParameters getRemoteParameters();

    @Nullable
    RTCIceCandidatePair getSelectedCandidatePair();

}
