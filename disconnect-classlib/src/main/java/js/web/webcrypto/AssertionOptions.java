package js.web.webcrypto;

import js.web.credentialmanagement.webauthn.ScopedCredentialDescriptor;
import js.web.credentialmanagement.webauthn.WebAuthnExtensions;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;
import js.util.collections.Array;

import org.teavm.jso.JSByRef;


public interface AssertionOptions extends Any {
    @JSProperty
    @Nullable
    Array<ScopedCredentialDescriptor> getAllowList();

    @JSProperty
    void setAllowList(Array<ScopedCredentialDescriptor> allowList);
    @JSProperty
    void setAllowList(@JSByRef ScopedCredentialDescriptor... allowList);

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
