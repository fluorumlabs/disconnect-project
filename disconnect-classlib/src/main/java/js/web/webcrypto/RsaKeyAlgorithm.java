package js.web.webcrypto;

import org.teavm.jso.JSProperty;


public interface RsaKeyAlgorithm extends KeyAlgorithm {
    @JSProperty
    int getModulusLength();

    @JSProperty
    void setModulusLength(int modulusLength);

    @JSProperty
    JsBigInteger getPublicExponent();

    @JSProperty
    void setPublicExponent(JsBigInteger publicExponent);

}
