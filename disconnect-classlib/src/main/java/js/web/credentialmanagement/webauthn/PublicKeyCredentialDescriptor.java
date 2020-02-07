package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.BufferSource;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PublicKeyCredentialDescriptor extends Any {
    @JSProperty
    BufferSource getId();

    @JSProperty
    void setId(BufferSource id);

    @JSProperty
    @Nullable
    Array<AuthenticatorTransport> getTransports();

    @JSProperty
    void setTransports(AuthenticatorTransport... transports);

    @JSProperty
    void setTransports(Array<AuthenticatorTransport> transports);

    @JSProperty
    PublicKeyCredentialType getType();

    @JSProperty
    void setType(PublicKeyCredentialType type);

}
