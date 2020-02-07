package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import js.util.collections.Array;
import js.web.dom.BufferSource;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface ScopedCredentialDescriptor extends Any {
    @JSProperty
    @Nullable
    BufferSource getId();

    @JSProperty
    void setId(BufferSource id);

    @JSProperty
    @Nullable
    Array<Transport> getTransports();

    @JSProperty
    void setTransports(Transport... transports);

    @JSProperty
    void setTransports(Array<Transport> transports);

    @JSProperty
    ScopedCredentialType getType();

    @JSProperty
    void setType(ScopedCredentialType type);

}
