package js.web.webcrypto;

import org.teavm.jso.JSProperty;

import js.lang.Unknown;


public interface HmacImportParams extends Algorithm {
    @JSProperty
    Unknown getHash();

    @JSProperty
    void setHash(String hash);
    @JSProperty
    void setHash(Algorithm hash);

    @JSProperty
    int getLength();

    @JSProperty
    void setLength(int length);

}
