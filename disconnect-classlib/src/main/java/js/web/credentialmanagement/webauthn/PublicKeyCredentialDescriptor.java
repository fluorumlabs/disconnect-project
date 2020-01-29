package js.web.credentialmanagement.webauthn;

import js.util.collections.Array;
import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Any;

import org.teavm.jso.JSByRef;


public interface PublicKeyCredentialDescriptor extends Any {
    @JSProperty
    BufferSource getId();

    @JSProperty
    void setId(BufferSource id);

    @JSProperty
    @Nullable
    Array<AuthenticatorTransport> getTransports();

    @JSProperty
    void setTransports(@JSByRef AuthenticatorTransport... transports);
    @JSProperty
    void setTransports(Array<AuthenticatorTransport> transports);

    @JSProperty
    PublicKeyCredentialType getType();

    @JSProperty
    void setType(PublicKeyCredentialType type);

}
