package js.web.webcrypto;

import org.teavm.jso.JSProperty;


public interface EcKeyGenParams extends Algorithm {
    @JSProperty
    String getNamedCurve();

    @JSProperty
    void setNamedCurve(String namedCurve);

}
