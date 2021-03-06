package js.web.webcrypto;

import js.lang.Any;
import js.util.collections.Array;
import js.web.credentialmanagement.webauthn.ScopedCredentialDescriptor;
import js.web.credentialmanagement.webauthn.WebAuthnExtensions;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface AssertionOptions extends Any {
    @JSProperty
    @Nullable
    Array<ScopedCredentialDescriptor> getAllowList();

    @JSProperty
    void setAllowList(Array<ScopedCredentialDescriptor> allowList);

    @JSProperty
    void setAllowList(ScopedCredentialDescriptor... allowList);

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
