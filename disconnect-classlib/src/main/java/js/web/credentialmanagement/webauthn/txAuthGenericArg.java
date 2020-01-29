package js.web.credentialmanagement.webauthn;

import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.util.buffers.ArrayBuffer;


public interface txAuthGenericArg extends Any {
    @JSProperty
    ArrayBuffer getContent();

    @JSProperty
    void setContent(ArrayBuffer content);

    @JSProperty
    String getContentType();

    @JSProperty
    void setContentType(String contentType);

}
