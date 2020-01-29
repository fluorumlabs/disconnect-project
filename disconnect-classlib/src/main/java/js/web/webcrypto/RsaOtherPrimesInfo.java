package js.web.webcrypto;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RsaOtherPrimesInfo extends Any {
    @JSProperty
    @Nullable
    String getD();

    @JSProperty
    void setD(String d);

    @JSProperty
    @Nullable
    String getR();

    @JSProperty
    void setR(String r);

    @JSProperty
    @Nullable
    String getT();

    @JSProperty
    void setT(String t);

}
