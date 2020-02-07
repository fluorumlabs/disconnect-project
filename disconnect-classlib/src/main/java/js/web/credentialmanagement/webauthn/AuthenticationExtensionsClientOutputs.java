package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.util.buffers.ArrayBuffer;
import js.web.geolocation.GeolocationCoordinates;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface AuthenticationExtensionsClientOutputs extends Any {
    @JSProperty
    boolean isAppid();

    @JSProperty
    void setAppid(boolean appid);

    @JSProperty
    boolean isAuthnSel();

    @JSProperty
    void setAuthnSel(boolean authnSel);

    @JSProperty
    @Nullable
    String[] getExts();

    @JSProperty
    void setExts(String... exts);

    @JSProperty
    @Nullable
    GeolocationCoordinates getLoc();

    @JSProperty
    void setLoc(GeolocationCoordinates loc);

    @JSProperty
    @Nullable
    ArrayBuffer getTxAuthGeneric();

    @JSProperty
    void setTxAuthGeneric(ArrayBuffer txAuthGeneric);

    @JSProperty
    @Nullable
    String getTxAuthSimple();

    @JSProperty
    void setTxAuthSimple(String txAuthSimple);

    @JSProperty
    @Nullable
    ArrayBuffer getUvi();

    @JSProperty
    void setUvi(ArrayBuffer uvi);

    @JSProperty
    @Nullable
    int[][] getUvm();

    @JSProperty
    void setUvm(int[]... uvm);

}
