package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ScopedCredentialOptions extends Any {
    @JSProperty
    @Nullable
    Array<ScopedCredentialDescriptor> getExcludeList();

    @JSProperty
    void setExcludeList(ScopedCredentialDescriptor... excludeList);

    @JSProperty
    void setExcludeList(Array<ScopedCredentialDescriptor> excludeList);

    @JSProperty
    @Nullable
    WebAuthnExtensions getExtensions();

    @JSProperty
    void setExtensions(WebAuthnExtensions extensions);

    @JSProperty
    @Nullable
    String getRpId();

    @JSProperty
    void setRpId(String rpId);

    @JSProperty
    double getTimeoutSeconds();

    @JSProperty
    void setTimeoutSeconds(double timeoutSeconds);

}
