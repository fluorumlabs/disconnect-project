package js.web.dom;

import js.lang.Promise;
import js.util.collections.Array;
import js.util.collections.ReadonlyArray;
import js.util.function.JsConsumer;
import js.util.iterable.JsIterable;
import js.web.beacon.NavigatorBeacon;
import js.web.credentialmanagement.CredentialsContainer;
import js.web.gamepad.Gamepad;
import js.web.geolocation.Geolocation;
import js.web.mediastreams.*;
import js.web.permissions.Permissions;
import js.web.serviceworker.ServiceWorkerContainer;
import js.web.storage.NavigatorStorage;
import js.web.webvr.VRDisplay;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * The state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities.
 */
public interface Navigator extends NavigatorAutomationInformation, NavigatorBeacon, NavigatorConcurrentHardware, NavigatorContentUtils, NavigatorCookies, NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorPlugins, NavigatorStorage {
    @JSBody(script = "return Navigator.prototype")
    static Navigator prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new Navigator()")
    static Navigator create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    ReadonlyArray<VRDisplay> getActiveVRDisplays();

    @JSProperty
    Clipboard getClipboard();

    @JSProperty
    CredentialsContainer getCredentials();

    @JSProperty
    @Nullable
    String getDoNotTrack();

    @JSProperty
    Geolocation getGeolocation();

    @JSProperty
    int getMaxTouchPoints();

    @JSProperty
    MediaDevices getMediaDevices();

    @JSProperty
    boolean isMsManipulationViewsEnabled();

    @JSProperty
    int getMsMaxTouchPoints();

    @JSProperty
    boolean isMsPointerEnabled();

    @JSProperty
    Permissions getPermissions();

    @JSProperty
    boolean isPointerEnabled();

    @JSProperty
    ServiceWorkerContainer getServiceWorker();

    Array<Gamepad> getGamepads();

    void getUserMedia(MediaStreamConstraints constraints, JsConsumer<MediaStream> successCallback, JsConsumer<MediaStreamError> errorCallback);

    Promise<Array<VRDisplay>> getVRDisplays();

    Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(String keySystem, MediaKeySystemConfiguration... supportedConfigurations);

    Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(String keySystem, Array<MediaKeySystemConfiguration> supportedConfigurations);

    Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(String keySystem, JsIterable<MediaKeySystemConfiguration> supportedConfigurations);

    boolean vibrate(int pattern);

    boolean vibrate(int... pattern);

}
