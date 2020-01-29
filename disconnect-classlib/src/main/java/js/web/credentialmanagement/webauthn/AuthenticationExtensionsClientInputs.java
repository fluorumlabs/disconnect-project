package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.BufferSource;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface AuthenticationExtensionsClientInputs extends Any {
    @JSProperty
    @Nullable
    String getAppid();

    @JSProperty
    void setAppid(String appid);

    @JSProperty
    @Nullable
    Array<BufferSource> getAuthnSel();

    @JSProperty
    void setAuthnSel(Array<BufferSource> authnSel);

    @JSProperty
    void setAuthnSel(@JSByRef BufferSource... authnSel);

    @JSProperty
    boolean isExts();

    @JSProperty
    void setExts(boolean exts);

    @JSProperty
    boolean isLoc();

    @JSProperty
    void setLoc(boolean loc);

    @JSProperty
    @Nullable
    txAuthGenericArg getTxAuthGeneric();

    @JSProperty
    void setTxAuthGeneric(txAuthGenericArg txAuthGeneric);

    @JSProperty
    @Nullable
    String getTxAuthSimple();

    @JSProperty
    void setTxAuthSimple(String txAuthSimple);

    @JSProperty
    boolean isUvi();

    @JSProperty
    void setUvi(boolean uvi);

    @JSProperty
    boolean isUvm();

    @JSProperty
    void setUvm(boolean uvm);

}
