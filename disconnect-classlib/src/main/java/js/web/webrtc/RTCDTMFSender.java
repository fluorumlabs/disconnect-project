package js.web.webrtc;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.web.dom.AddEventListenerOptions;
import js.web.dom.EventListener;
import js.web.dom.EventListenerOptions;
import js.web.dom.EventTarget;

/**
* Created by Artem Godin on 1/22/2020.
*/
public interface RTCDTMFSender extends EventTarget {
@JSProperty
boolean isCanInsertDTMF();

@JSProperty
@Nullable
EventListener<RTCDTMFToneChangeEvent> getOntonechange();

@JSProperty
void setOntonechange(EventListener<RTCDTMFToneChangeEvent> ontonechange);

default void addToneChangeEventListener(EventListener<RTCDTMFToneChangeEvent> listener, AddEventListenerOptions options) {
    addEventListener("tonechange", listener, options);
}
default void addToneChangeEventListener(EventListener<RTCDTMFToneChangeEvent> listener, boolean options) {
    addEventListener("tonechange", listener, options);
}
default void addToneChangeEventListener(EventListener<RTCDTMFToneChangeEvent> listener) {
    addEventListener("tonechange", listener);
}

default void removeToneChangeEventListener(EventListener<RTCDTMFToneChangeEvent> listener, EventListenerOptions options) {
    removeEventListener("tonechange", listener, options);
}
default void removeToneChangeEventListener(EventListener<RTCDTMFToneChangeEvent> listener, boolean options) {
    removeEventListener("tonechange", listener, options);
}
default void removeToneChangeEventListener(EventListener<RTCDTMFToneChangeEvent> listener) {
    removeEventListener("tonechange", listener);
}
@JSProperty
String getToneBuffer();

void insertDTMF(String tones, double duration, double interToneGap);
void insertDTMF(String tones, double duration);
void insertDTMF(String tones);

@JSBody(script = "return RTCDTMFSender.prototype")
static RTCDTMFSender prototype() {
    throw new UnsupportedOperationException("Available only in JavaScript");
}

@JSBody(script = "return new RTCDTMFSender()")
static RTCDTMFSender create() {
    throw new UnsupportedOperationException("Available only in JavaScript");
}

}
