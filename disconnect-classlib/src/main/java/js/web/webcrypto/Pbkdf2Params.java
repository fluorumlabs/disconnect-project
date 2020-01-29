package js.web.webcrypto;

import js.lang.Unknown;
import js.web.dom.BufferSource;
import org.teavm.jso.JSProperty;


public interface Pbkdf2Params extends Algorithm {
    @JSProperty
    Unknown getHash();

    @JSProperty
    void setHash(String hash);

    @JSProperty
    void setHash(Algorithm hash);

    @JSProperty
    double getIterations();

    @JSProperty
    void setIterations(double iterations);

    @JSProperty
    BufferSource getSalt();

    @JSProperty
    void setSalt(BufferSource salt);


}
