package js.web.webcrypto;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface KeyAlgorithm extends Any {
    @JSProperty
    String getName();

    @JSProperty
    void setName(String name);

}
