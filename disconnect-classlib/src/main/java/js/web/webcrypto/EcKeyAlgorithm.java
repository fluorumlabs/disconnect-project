package js.web.webcrypto;

import org.teavm.jso.JSProperty;


public interface EcKeyAlgorithm extends KeyAlgorithm {
    @JSProperty
    String getNamedCurve();

    @JSProperty
    void setNamedCurve(String namedCurve);

}
