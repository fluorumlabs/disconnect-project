package js.web.dom;

import js.lang.Any;
import js.lang.Unknown;
import js.util.buffers.Transferable;
import js.util.collections.Array;
import js.util.function.JsDoubleConsumer;
import js.web.ambientlightevents.DeviceLightEvent;
import js.web.console.Console;
import js.web.console.WindowConsole;
import js.web.cssom.CSSRuleList;
import js.web.cssom.CSSStyleDeclaration;
import js.web.cssom.MediaQueryList;
import js.web.cssom.Screen;
import js.web.deviceorientation.DeviceMotionEvent;
import js.web.deviceorientation.DeviceOrientationEvent;
import js.web.history.History;
import js.web.indexeddb.IDBEnvironment;
import js.web.performance.Performance;
import js.web.serviceworker.CacheStorage;
import js.web.webcomponents.CustomElementRegistry;
import js.web.webcrypto.Crypto;
import js.web.webspeech.SpeechSynthesis;
import js.web.webstorage.WindowLocalStorage;
import js.web.webstorage.WindowSessionStorage;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * A window containing a DOM document; the document property points to the DOM document loaded in that window.
 */
public interface Window extends EventTarget, AnimationFrameProvider, GlobalEventHandlers, IDBEnvironment, WindowBase64, WindowConsole, WindowEventHandlers, WindowLocalStorage, WindowOrWorkerGlobalScope, WindowSessionStorage, WindowTimers {
    Window WINDOW = getWindowInstance();

    Console CONSOLE = getConsoleInstance();

    Document DOCUMENT = getDocumentInstance();

    Location LOCATION = getLocationInstance();

    Navigator NAVIGATOR = getNavigatorInstance();

    History HISTORY = getHistoryInstance();

    @JSBody(script = "return Window.prototype")
    static Window prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Window()")
    static Window create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return window")
    static Window getWindowInstance() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return window.console")
    static Console getConsoleInstance() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return window.document")
    static Document getDocumentInstance() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return window.location")
    static Location getLocationInstance() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return window.navigator")
    static Navigator getNavigatorInstance() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return window.history")
    static History getHistoryInstance() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    ApplicationCache getApplicationCache();

    @JSProperty
    CacheStorage getCaches();

    @JSProperty
    Navigator getClientInformation();

    @JSProperty
    boolean isClosed();

    @JSProperty
    Crypto getCrypto();

    @JSProperty
    CustomElementRegistry getCustomElements();

    @JSProperty
    void setCustomElements(CustomElementRegistry customElements);

    @JSProperty
    String getDefaultStatus();

    @JSProperty
    void setDefaultStatus(String defaultStatus);

    @JSProperty
    double getDevicePixelRatio();

    @JSProperty
    String getDoNotTrack();

    @JSProperty
    Document getDocument();

    @Deprecated
    @JSProperty
    @Nullable
    Event getEvent();

    @Deprecated
    @JSProperty
    External getExternal();

    @JSProperty
    Element getFrameElement();

    @JSProperty
    Window getFrames();

    @JSProperty
    History getHistory();

    @JSProperty
    double getInnerHeight();

    @JSProperty
    double getInnerWidth();

    @JSProperty
    boolean isIsSecureContext();

    @JSProperty
    int getLength();

    @JSProperty
    Location getLocation();

    @JSProperty
    void setLocation(Location location);

    @JSProperty
    BarProp getLocationbar();

    @JSProperty
    BarProp getMenubar();

    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

    @JSProperty
    Navigator getNavigator();

    @JSProperty
    Unknown isOffscreenBuffering();

    @JSProperty
    void setOffscreenBuffering(String offscreenBuffering);

    @JSProperty
    void setOffscreenBuffering(boolean offscreenBuffering);

    @JSProperty
    @Nullable
    EventListener<Event> getOncompassneedscalibration();

    @JSProperty
    void setOncompassneedscalibration(EventListener<Event> oncompassneedscalibration);

    default void addCompassNeedsCalibrationEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("compassneedscalibration", listener, options);
    }

    default void addCompassNeedsCalibrationEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("compassneedscalibration", listener, options);
    }

    default void addCompassNeedsCalibrationEventListener(EventListener<Event> listener) {
        addEventListener("compassneedscalibration", listener);
    }

    default void removeCompassNeedsCalibrationEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("compassneedscalibration", listener, options);
    }

    default void removeCompassNeedsCalibrationEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("compassneedscalibration", listener, options);
    }

    default void removeCompassNeedsCalibrationEventListener(EventListener<Event> listener) {
        removeEventListener("compassneedscalibration", listener);
    }

    @JSProperty
    @Nullable
    EventListener<DeviceLightEvent> getOndevicelight();

    @JSProperty
    void setOndevicelight(EventListener<DeviceLightEvent> ondevicelight);

    default void addDeviceLightEventListener(EventListener<DeviceLightEvent> listener, AddEventListenerOptions options) {
        addEventListener("devicelight", listener, options);
    }

    default void addDeviceLightEventListener(EventListener<DeviceLightEvent> listener, boolean options) {
        addEventListener("devicelight", listener, options);
    }

    default void addDeviceLightEventListener(EventListener<DeviceLightEvent> listener) {
        addEventListener("devicelight", listener);
    }

    default void removeDeviceLightEventListener(EventListener<DeviceLightEvent> listener, EventListenerOptions options) {
        removeEventListener("devicelight", listener, options);
    }

    default void removeDeviceLightEventListener(EventListener<DeviceLightEvent> listener, boolean options) {
        removeEventListener("devicelight", listener, options);
    }

    default void removeDeviceLightEventListener(EventListener<DeviceLightEvent> listener) {
        removeEventListener("devicelight", listener);
    }

    @JSProperty
    @Nullable
    EventListener<DeviceMotionEvent> getOndevicemotion();

    @JSProperty
    void setOndevicemotion(EventListener<DeviceMotionEvent> ondevicemotion);

    default void addDeviceMotionEventListener(EventListener<DeviceMotionEvent> listener, AddEventListenerOptions options) {
        addEventListener("devicemotion", listener, options);
    }

    default void addDeviceMotionEventListener(EventListener<DeviceMotionEvent> listener, boolean options) {
        addEventListener("devicemotion", listener, options);
    }

    default void addDeviceMotionEventListener(EventListener<DeviceMotionEvent> listener) {
        addEventListener("devicemotion", listener);
    }

    default void removeDeviceMotionEventListener(EventListener<DeviceMotionEvent> listener, EventListenerOptions options) {
        removeEventListener("devicemotion", listener, options);
    }

    default void removeDeviceMotionEventListener(EventListener<DeviceMotionEvent> listener, boolean options) {
        removeEventListener("devicemotion", listener, options);
    }

    default void removeDeviceMotionEventListener(EventListener<DeviceMotionEvent> listener) {
        removeEventListener("devicemotion", listener);
    }

    @JSProperty
    @Nullable
    EventListener<DeviceOrientationEvent> getOndeviceorientation();

    @JSProperty
    void setOndeviceorientation(EventListener<DeviceOrientationEvent> ondeviceorientation);

    default void addDeviceOrientationEventListener(EventListener<DeviceOrientationEvent> listener, AddEventListenerOptions options) {
        addEventListener("deviceorientation", listener, options);
    }

    default void addDeviceOrientationEventListener(EventListener<DeviceOrientationEvent> listener, boolean options) {
        addEventListener("deviceorientation", listener, options);
    }

    default void addDeviceOrientationEventListener(EventListener<DeviceOrientationEvent> listener) {
        addEventListener("deviceorientation", listener);
    }

    default void removeDeviceOrientationEventListener(EventListener<DeviceOrientationEvent> listener, EventListenerOptions options) {
        removeEventListener("deviceorientation", listener, options);
    }

    default void removeDeviceOrientationEventListener(EventListener<DeviceOrientationEvent> listener, boolean options) {
        removeEventListener("deviceorientation", listener, options);
    }

    default void removeDeviceOrientationEventListener(EventListener<DeviceOrientationEvent> listener) {
        removeEventListener("deviceorientation", listener);
    }

    @JSProperty
    @Nullable
    EventListener<DeviceOrientationEvent> getOndeviceorientationabsolute();

    @JSProperty
    void setOndeviceorientationabsolute(EventListener<DeviceOrientationEvent> ondeviceorientationabsolute);

    default void addDeviceOrientationAbsoluteEventListener(EventListener<DeviceOrientationEvent> listener, AddEventListenerOptions options) {
        addEventListener("deviceorientationabsolute", listener, options);
    }

    default void addDeviceOrientationAbsoluteEventListener(EventListener<DeviceOrientationEvent> listener, boolean options) {
        addEventListener("deviceorientationabsolute", listener, options);
    }

    default void addDeviceOrientationAbsoluteEventListener(EventListener<DeviceOrientationEvent> listener) {
        addEventListener("deviceorientationabsolute", listener);
    }

    default void removeDeviceOrientationAbsoluteEventListener(EventListener<DeviceOrientationEvent> listener, EventListenerOptions options) {
        removeEventListener("deviceorientationabsolute", listener, options);
    }

    default void removeDeviceOrientationAbsoluteEventListener(EventListener<DeviceOrientationEvent> listener, boolean options) {
        removeEventListener("deviceorientationabsolute", listener, options);
    }

    default void removeDeviceOrientationAbsoluteEventListener(EventListener<DeviceOrientationEvent> listener) {
        removeEventListener("deviceorientationabsolute", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmousewheel();

    @JSProperty
    void setOnmousewheel(EventListener<Event> onmousewheel);

    default void addMouseWheelEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("mousewheel", listener, options);
    }

    default void addMouseWheelEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("mousewheel", listener, options);
    }

    default void addMouseWheelEventListener(EventListener<Event> listener) {
        addEventListener("mousewheel", listener);
    }

    default void removeMouseWheelEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("mousewheel", listener, options);
    }

    default void removeMouseWheelEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("mousewheel", listener, options);
    }

    default void removeMouseWheelEventListener(EventListener<Event> listener) {
        removeEventListener("mousewheel", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmsgesturechange();

    @JSProperty
    void setOnmsgesturechange(EventListener<Event> onmsgesturechange);

    default void addMSGestureChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("msgesturechange", listener, options);
    }

    default void addMSGestureChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("msgesturechange", listener, options);
    }

    default void addMSGestureChangeEventListener(EventListener<Event> listener) {
        addEventListener("msgesturechange", listener);
    }

    default void removeMSGestureChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("msgesturechange", listener, options);
    }

    default void removeMSGestureChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("msgesturechange", listener, options);
    }

    default void removeMSGestureChangeEventListener(EventListener<Event> listener) {
        removeEventListener("msgesturechange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmsgesturedoubletap();

    @JSProperty
    void setOnmsgesturedoubletap(EventListener<Event> onmsgesturedoubletap);

    default void addMSGestureDoubleTapEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("msgesturedoubletap", listener, options);
    }

    default void addMSGestureDoubleTapEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("msgesturedoubletap", listener, options);
    }

    default void addMSGestureDoubleTapEventListener(EventListener<Event> listener) {
        addEventListener("msgesturedoubletap", listener);
    }

    default void removeMSGestureDoubleTapEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("msgesturedoubletap", listener, options);
    }

    default void removeMSGestureDoubleTapEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("msgesturedoubletap", listener, options);
    }

    default void removeMSGestureDoubleTapEventListener(EventListener<Event> listener) {
        removeEventListener("msgesturedoubletap", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmsgestureend();

    @JSProperty
    void setOnmsgestureend(EventListener<Event> onmsgestureend);

    default void addMSGestureEndEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("msgestureend", listener, options);
    }

    default void addMSGestureEndEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("msgestureend", listener, options);
    }

    default void addMSGestureEndEventListener(EventListener<Event> listener) {
        addEventListener("msgestureend", listener);
    }

    default void removeMSGestureEndEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("msgestureend", listener, options);
    }

    default void removeMSGestureEndEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("msgestureend", listener, options);
    }

    default void removeMSGestureEndEventListener(EventListener<Event> listener) {
        removeEventListener("msgestureend", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmsgesturehold();

    @JSProperty
    void setOnmsgesturehold(EventListener<Event> onmsgesturehold);

    default void addMSGestureHoldEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("msgesturehold", listener, options);
    }

    default void addMSGestureHoldEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("msgesturehold", listener, options);
    }

    default void addMSGestureHoldEventListener(EventListener<Event> listener) {
        addEventListener("msgesturehold", listener);
    }

    default void removeMSGestureHoldEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("msgesturehold", listener, options);
    }

    default void removeMSGestureHoldEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("msgesturehold", listener, options);
    }

    default void removeMSGestureHoldEventListener(EventListener<Event> listener) {
        removeEventListener("msgesturehold", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmsgesturestart();

    @JSProperty
    void setOnmsgesturestart(EventListener<Event> onmsgesturestart);

    default void addMSGestureStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("msgesturestart", listener, options);
    }

    default void addMSGestureStartEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("msgesturestart", listener, options);
    }

    default void addMSGestureStartEventListener(EventListener<Event> listener) {
        addEventListener("msgesturestart", listener);
    }

    default void removeMSGestureStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("msgesturestart", listener, options);
    }

    default void removeMSGestureStartEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("msgesturestart", listener, options);
    }

    default void removeMSGestureStartEventListener(EventListener<Event> listener) {
        removeEventListener("msgesturestart", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmsgesturetap();

    @JSProperty
    void setOnmsgesturetap(EventListener<Event> onmsgesturetap);

    default void addMSGestureTapEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("msgesturetap", listener, options);
    }

    default void addMSGestureTapEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("msgesturetap", listener, options);
    }

    default void addMSGestureTapEventListener(EventListener<Event> listener) {
        addEventListener("msgesturetap", listener);
    }

    default void removeMSGestureTapEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("msgesturetap", listener, options);
    }

    default void removeMSGestureTapEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("msgesturetap", listener, options);
    }

    default void removeMSGestureTapEventListener(EventListener<Event> listener) {
        removeEventListener("msgesturetap", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmsinertiastart();

    @JSProperty
    void setOnmsinertiastart(EventListener<Event> onmsinertiastart);

    default void addMSInertiaStartEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("msinertiastart", listener, options);
    }

    default void addMSInertiaStartEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("msinertiastart", listener, options);
    }

    default void addMSInertiaStartEventListener(EventListener<Event> listener) {
        addEventListener("msinertiastart", listener);
    }

    default void removeMSInertiaStartEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("msinertiastart", listener, options);
    }

    default void removeMSInertiaStartEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("msinertiastart", listener, options);
    }

    default void removeMSInertiaStartEventListener(EventListener<Event> listener) {
        removeEventListener("msinertiastart", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmspointercancel();

    @JSProperty
    void setOnmspointercancel(EventListener<Event> onmspointercancel);

    default void addMSPointerCancelEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("mspointercancel", listener, options);
    }

    default void addMSPointerCancelEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("mspointercancel", listener, options);
    }

    default void addMSPointerCancelEventListener(EventListener<Event> listener) {
        addEventListener("mspointercancel", listener);
    }

    default void removeMSPointerCancelEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("mspointercancel", listener, options);
    }

    default void removeMSPointerCancelEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("mspointercancel", listener, options);
    }

    default void removeMSPointerCancelEventListener(EventListener<Event> listener) {
        removeEventListener("mspointercancel", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmspointerdown();

    @JSProperty
    void setOnmspointerdown(EventListener<Event> onmspointerdown);

    default void addMSPointerDownEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("mspointerdown", listener, options);
    }

    default void addMSPointerDownEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("mspointerdown", listener, options);
    }

    default void addMSPointerDownEventListener(EventListener<Event> listener) {
        addEventListener("mspointerdown", listener);
    }

    default void removeMSPointerDownEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("mspointerdown", listener, options);
    }

    default void removeMSPointerDownEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("mspointerdown", listener, options);
    }

    default void removeMSPointerDownEventListener(EventListener<Event> listener) {
        removeEventListener("mspointerdown", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmspointerenter();

    @JSProperty
    void setOnmspointerenter(EventListener<Event> onmspointerenter);

    default void addMSPointerEnterEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("mspointerenter", listener, options);
    }

    default void addMSPointerEnterEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("mspointerenter", listener, options);
    }

    default void addMSPointerEnterEventListener(EventListener<Event> listener) {
        addEventListener("mspointerenter", listener);
    }

    default void removeMSPointerEnterEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("mspointerenter", listener, options);
    }

    default void removeMSPointerEnterEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("mspointerenter", listener, options);
    }

    default void removeMSPointerEnterEventListener(EventListener<Event> listener) {
        removeEventListener("mspointerenter", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmspointerleave();

    @JSProperty
    void setOnmspointerleave(EventListener<Event> onmspointerleave);

    default void addMSPointerLeaveEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("mspointerleave", listener, options);
    }

    default void addMSPointerLeaveEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("mspointerleave", listener, options);
    }

    default void addMSPointerLeaveEventListener(EventListener<Event> listener) {
        addEventListener("mspointerleave", listener);
    }

    default void removeMSPointerLeaveEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("mspointerleave", listener, options);
    }

    default void removeMSPointerLeaveEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("mspointerleave", listener, options);
    }

    default void removeMSPointerLeaveEventListener(EventListener<Event> listener) {
        removeEventListener("mspointerleave", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmspointermove();

    @JSProperty
    void setOnmspointermove(EventListener<Event> onmspointermove);

    default void addMSPointerMoveEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("mspointermove", listener, options);
    }

    default void addMSPointerMoveEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("mspointermove", listener, options);
    }

    default void addMSPointerMoveEventListener(EventListener<Event> listener) {
        addEventListener("mspointermove", listener);
    }

    default void removeMSPointerMoveEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("mspointermove", listener, options);
    }

    default void removeMSPointerMoveEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("mspointermove", listener, options);
    }

    default void removeMSPointerMoveEventListener(EventListener<Event> listener) {
        removeEventListener("mspointermove", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmspointerout();

    @JSProperty
    void setOnmspointerout(EventListener<Event> onmspointerout);

    default void addMSPointerOutEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("mspointerout", listener, options);
    }

    default void addMSPointerOutEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("mspointerout", listener, options);
    }

    default void addMSPointerOutEventListener(EventListener<Event> listener) {
        addEventListener("mspointerout", listener);
    }

    default void removeMSPointerOutEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("mspointerout", listener, options);
    }

    default void removeMSPointerOutEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("mspointerout", listener, options);
    }

    default void removeMSPointerOutEventListener(EventListener<Event> listener) {
        removeEventListener("mspointerout", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmspointerover();

    @JSProperty
    void setOnmspointerover(EventListener<Event> onmspointerover);

    default void addMSPointerOverEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("mspointerover", listener, options);
    }

    default void addMSPointerOverEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("mspointerover", listener, options);
    }

    default void addMSPointerOverEventListener(EventListener<Event> listener) {
        addEventListener("mspointerover", listener);
    }

    default void removeMSPointerOverEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("mspointerover", listener, options);
    }

    default void removeMSPointerOverEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("mspointerover", listener, options);
    }

    default void removeMSPointerOverEventListener(EventListener<Event> listener) {
        removeEventListener("mspointerover", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnmspointerup();

    @JSProperty
    void setOnmspointerup(EventListener<Event> onmspointerup);

    default void addMSPointerUpEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("mspointerup", listener, options);
    }

    default void addMSPointerUpEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("mspointerup", listener, options);
    }

    default void addMSPointerUpEventListener(EventListener<Event> listener) {
        addEventListener("mspointerup", listener);
    }

    default void removeMSPointerUpEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("mspointerup", listener, options);
    }

    default void removeMSPointerUpEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("mspointerup", listener, options);
    }

    default void removeMSPointerUpEventListener(EventListener<Event> listener) {
        removeEventListener("mspointerup", listener);
    }

    @Deprecated
    @JSProperty
    @Nullable
    EventListener<Event> getOnorientationchange();

    @Deprecated
    @JSProperty
    void setOnorientationchange(EventListener<Event> onorientationchange);

    @Deprecated
    default void addOrientationChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("orientationchange", listener, options);
    }

    @Deprecated
    default void addOrientationChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("orientationchange", listener, options);
    }

    @Deprecated
    default void addOrientationChangeEventListener(EventListener<Event> listener) {
        addEventListener("orientationchange", listener);
    }

    @Deprecated
    default void removeOrientationChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("orientationchange", listener, options);
    }

    @Deprecated
    default void removeOrientationChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("orientationchange", listener, options);
    }

    @Deprecated
    default void removeOrientationChangeEventListener(EventListener<Event> listener) {
        removeEventListener("orientationchange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<ProgressEvent<Window>> getOnreadystatechange();

    @JSProperty
    void setOnreadystatechange(EventListener<ProgressEvent<Window>> onreadystatechange);

    default void addReadyStateChangeEventListener(EventListener<ProgressEvent<Window>> listener, AddEventListenerOptions options) {
        addEventListener("readystatechange", listener, options);
    }

    default void addReadyStateChangeEventListener(EventListener<ProgressEvent<Window>> listener, boolean options) {
        addEventListener("readystatechange", listener, options);
    }

    default void addReadyStateChangeEventListener(EventListener<ProgressEvent<Window>> listener) {
        addEventListener("readystatechange", listener);
    }

    default void removeReadyStateChangeEventListener(EventListener<ProgressEvent<Window>> listener, EventListenerOptions options) {
        removeEventListener("readystatechange", listener, options);
    }

    default void removeReadyStateChangeEventListener(EventListener<ProgressEvent<Window>> listener, boolean options) {
        removeEventListener("readystatechange", listener, options);
    }

    default void removeReadyStateChangeEventListener(EventListener<ProgressEvent<Window>> listener) {
        removeEventListener("readystatechange", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnvrdisplayactivate();

    @JSProperty
    void setOnvrdisplayactivate(EventListener<Event> onvrdisplayactivate);

    default void addVRDisplayActivateEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("vrdisplayactivate", listener, options);
    }

    default void addVRDisplayActivateEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("vrdisplayactivate", listener, options);
    }

    default void addVRDisplayActivateEventListener(EventListener<Event> listener) {
        addEventListener("vrdisplayactivate", listener);
    }

    default void removeVRDisplayActivateEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("vrdisplayactivate", listener, options);
    }

    default void removeVRDisplayActivateEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("vrdisplayactivate", listener, options);
    }

    default void removeVRDisplayActivateEventListener(EventListener<Event> listener) {
        removeEventListener("vrdisplayactivate", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnvrdisplayblur();

    @JSProperty
    void setOnvrdisplayblur(EventListener<Event> onvrdisplayblur);

    default void addVRDisplayBlurEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("vrdisplayblur", listener, options);
    }

    default void addVRDisplayBlurEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("vrdisplayblur", listener, options);
    }

    default void addVRDisplayBlurEventListener(EventListener<Event> listener) {
        addEventListener("vrdisplayblur", listener);
    }

    default void removeVRDisplayBlurEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("vrdisplayblur", listener, options);
    }

    default void removeVRDisplayBlurEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("vrdisplayblur", listener, options);
    }

    default void removeVRDisplayBlurEventListener(EventListener<Event> listener) {
        removeEventListener("vrdisplayblur", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnvrdisplayconnect();

    @JSProperty
    void setOnvrdisplayconnect(EventListener<Event> onvrdisplayconnect);

    default void addVRDisplayConnectEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("vrdisplayconnect", listener, options);
    }

    default void addVRDisplayConnectEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("vrdisplayconnect", listener, options);
    }

    default void addVRDisplayConnectEventListener(EventListener<Event> listener) {
        addEventListener("vrdisplayconnect", listener);
    }

    default void removeVRDisplayConnectEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("vrdisplayconnect", listener, options);
    }

    default void removeVRDisplayConnectEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("vrdisplayconnect", listener, options);
    }

    default void removeVRDisplayConnectEventListener(EventListener<Event> listener) {
        removeEventListener("vrdisplayconnect", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnvrdisplaydeactivate();

    @JSProperty
    void setOnvrdisplaydeactivate(EventListener<Event> onvrdisplaydeactivate);

    default void addVRDisplayDeactivateEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("vrdisplaydeactivate", listener, options);
    }

    default void addVRDisplayDeactivateEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("vrdisplaydeactivate", listener, options);
    }

    default void addVRDisplayDeactivateEventListener(EventListener<Event> listener) {
        addEventListener("vrdisplaydeactivate", listener);
    }

    default void removeVRDisplayDeactivateEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("vrdisplaydeactivate", listener, options);
    }

    default void removeVRDisplayDeactivateEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("vrdisplaydeactivate", listener, options);
    }

    default void removeVRDisplayDeactivateEventListener(EventListener<Event> listener) {
        removeEventListener("vrdisplaydeactivate", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnvrdisplaydisconnect();

    @JSProperty
    void setOnvrdisplaydisconnect(EventListener<Event> onvrdisplaydisconnect);

    default void addVRDisplayDisconnectEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("vrdisplaydisconnect", listener, options);
    }

    default void addVRDisplayDisconnectEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("vrdisplaydisconnect", listener, options);
    }

    default void addVRDisplayDisconnectEventListener(EventListener<Event> listener) {
        addEventListener("vrdisplaydisconnect", listener);
    }

    default void removeVRDisplayDisconnectEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("vrdisplaydisconnect", listener, options);
    }

    default void removeVRDisplayDisconnectEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("vrdisplaydisconnect", listener, options);
    }

    default void removeVRDisplayDisconnectEventListener(EventListener<Event> listener) {
        removeEventListener("vrdisplaydisconnect", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnvrdisplayfocus();

    @JSProperty
    void setOnvrdisplayfocus(EventListener<Event> onvrdisplayfocus);

    default void addVRDisplayFocusEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("vrdisplayfocus", listener, options);
    }

    default void addVRDisplayFocusEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("vrdisplayfocus", listener, options);
    }

    default void addVRDisplayFocusEventListener(EventListener<Event> listener) {
        addEventListener("vrdisplayfocus", listener);
    }

    default void removeVRDisplayFocusEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("vrdisplayfocus", listener, options);
    }

    default void removeVRDisplayFocusEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("vrdisplayfocus", listener, options);
    }

    default void removeVRDisplayFocusEventListener(EventListener<Event> listener) {
        removeEventListener("vrdisplayfocus", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnvrdisplaypointerrestricted();

    @JSProperty
    void setOnvrdisplaypointerrestricted(EventListener<Event> onvrdisplaypointerrestricted);

    default void addVRDisplayPointerRestrictedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("vrdisplaypointerrestricted", listener, options);
    }

    default void addVRDisplayPointerRestrictedEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("vrdisplaypointerrestricted", listener, options);
    }

    default void addVRDisplayPointerRestrictedEventListener(EventListener<Event> listener) {
        addEventListener("vrdisplaypointerrestricted", listener);
    }

    default void removeVRDisplayPointerRestrictedEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("vrdisplaypointerrestricted", listener, options);
    }

    default void removeVRDisplayPointerRestrictedEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("vrdisplaypointerrestricted", listener, options);
    }

    default void removeVRDisplayPointerRestrictedEventListener(EventListener<Event> listener) {
        removeEventListener("vrdisplaypointerrestricted", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnvrdisplaypointerunrestricted();

    @JSProperty
    void setOnvrdisplaypointerunrestricted(EventListener<Event> onvrdisplaypointerunrestricted);

    default void addVRDisplayPointerUnrestrictedEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("vrdisplaypointerunrestricted", listener, options);
    }

    default void addVRDisplayPointerUnrestrictedEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("vrdisplaypointerunrestricted", listener, options);
    }

    default void addVRDisplayPointerUnrestrictedEventListener(EventListener<Event> listener) {
        addEventListener("vrdisplaypointerunrestricted", listener);
    }

    default void removeVRDisplayPointerUnrestrictedEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("vrdisplaypointerunrestricted", listener, options);
    }

    default void removeVRDisplayPointerUnrestrictedEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("vrdisplaypointerunrestricted", listener, options);
    }

    default void removeVRDisplayPointerUnrestrictedEventListener(EventListener<Event> listener) {
        removeEventListener("vrdisplaypointerunrestricted", listener);
    }

    @JSProperty
    @Nullable
    EventListener<Event> getOnvrdisplaypresentchange();

    @JSProperty
    void setOnvrdisplaypresentchange(EventListener<Event> onvrdisplaypresentchange);

    default void addVRDisplayPresentChangeEventListener(EventListener<Event> listener, AddEventListenerOptions options) {
        addEventListener("vrdisplaypresentchange", listener, options);
    }

    default void addVRDisplayPresentChangeEventListener(EventListener<Event> listener, boolean options) {
        addEventListener("vrdisplaypresentchange", listener, options);
    }

    default void addVRDisplayPresentChangeEventListener(EventListener<Event> listener) {
        addEventListener("vrdisplaypresentchange", listener);
    }

    default void removeVRDisplayPresentChangeEventListener(EventListener<Event> listener, EventListenerOptions options) {
        removeEventListener("vrdisplaypresentchange", listener, options);
    }

    default void removeVRDisplayPresentChangeEventListener(EventListener<Event> listener, boolean options) {
        removeEventListener("vrdisplaypresentchange", listener, options);
    }

    default void removeVRDisplayPresentChangeEventListener(EventListener<Event> listener) {
        removeEventListener("vrdisplaypresentchange", listener);
    }

    @JSProperty
    Unknown getOpener();

    @JSProperty
    void setOpener(Any opener);

    @Deprecated
    @JSProperty
    Unknown getOrientation();

    @JSProperty
    double getOuterHeight();

    @JSProperty
    double getOuterWidth();

    @JSProperty
    double getPageXOffset();

    @JSProperty
    double getPageYOffset();

    @JSProperty
    Window getParent();

    @JSProperty
    Performance getPerformance();

    @JSProperty
    BarProp getPersonalbar();

    @JSProperty
    Screen getScreen();

    @JSProperty
    double getScreenLeft();

    @JSProperty
    double getScreenTop();

    @JSProperty
    double getScreenX();

    @JSProperty
    double getScreenY();

    @JSProperty
    double getScrollX();

    @JSProperty
    double getScrollY();

    @JSProperty
    BarProp getScrollbars();

    @JSProperty
    Window getSelf();

    @JSProperty
    SpeechSynthesis getSpeechSynthesis();

    @JSProperty
    String getStatus();

    @JSProperty
    void setStatus(String status);

    @JSProperty
    BarProp getStatusbar();

    @JSProperty
    StyleMedia getStyleMedia();

    @JSProperty
    BarProp getToolbar();

    @JSProperty
    Window getTop();

    @JSProperty
    Window getWindow();

    void alert(Any message);

    void alert();

    void blur();

    @Deprecated
    void captureEvents();

    void close();

    boolean confirm(String message);

    boolean confirm();

    void departFocus(NavigationReason navigationReason, FocusNavigationOrigin origin);

    void focus();

    CSSStyleDeclaration getComputedStyle(Element elt, @Nullable String pseudoElt);

    CSSStyleDeclaration getComputedStyle(Element elt);

    CSSRuleList getMatchedCSSRules(Element elt, @Nullable String pseudoElt);

    CSSRuleList getMatchedCSSRules(Element elt);

    @Nullable
    Selection getSelection();

    MediaQueryList matchMedia(String query);

    void moveBy(double x, double y);

    void moveTo(double x, double y);

    void msWriteProfilerMark(String profilerMarkName);

    @Nullable
    Window open(String url, String target, String features, boolean replace);

    Window open(String url, String target, String features);

    Window open(String url, String target);

    Window open(String url);

    Window open();

    void postMessage(Any message, String targetOrigin, @JSByRef Transferable... transfer);

    void postMessage(Any message, String targetOrigin, Array<Transferable> transfer);

    void postMessage(Any message, String targetOrigin);

    void print();

    @Nullable
    String prompt(String message, String _default);

    @Nullable
    String prompt(String message);

    @Nullable
    String prompt();

    @Deprecated
    void releaseEvents();

    void resizeBy(double x, double y);

    void resizeTo(double x, double y);

    void scroll(ScrollToOptions options);

    void scroll();

    void scroll(double x, double y);

    void scrollBy(ScrollToOptions options);

    void scrollBy();

    void scrollBy(double x, double y);

    void scrollTo(ScrollToOptions options);

    void scrollTo();

    void scrollTo(double x, double y);

    void stop();

    void webkitCancelAnimationFrame(int handle);

    WebKitPoint webkitConvertPointFromNodeToPage(Node node, WebKitPoint pt);

    WebKitPoint webkitConvertPointFromPageToNode(Node node, WebKitPoint pt);

    AnimationFrameHandle webkitRequestAnimationFrame(JsDoubleConsumer callback);

    @JSIndexer
    Window get(int index);
}
