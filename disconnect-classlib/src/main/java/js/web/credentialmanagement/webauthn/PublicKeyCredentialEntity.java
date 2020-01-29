package js.web.credentialmanagement.webauthn;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PublicKeyCredentialEntity extends Any {
    @JSProperty
    @Nullable
    String getIcon();

    @JSProperty
    void setIcon(String icon);

    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

}
