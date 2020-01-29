package js.web.webcrypto;

import js.lang.Any;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface JsonWebKey extends Any {
    @JSProperty
    @Nullable
    String getAlg();

    @JSProperty
    void setAlg(String alg);

    @JSProperty
    @Nullable
    String getCrv();

    @JSProperty
    void setCrv(String crv);

    @JSProperty
    @Nullable
    String getD();

    @JSProperty
    void setD(String d);

    @JSProperty
    @Nullable
    String getDp();

    @JSProperty
    void setDp(String dp);

    @JSProperty
    @Nullable
    String getDq();

    @JSProperty
    void setDq(String dq);

    @JSProperty
    @Nullable
    String getE();

    @JSProperty
    void setE(String e);

    @JSProperty
    boolean isExt();

    @JSProperty
    void setExt(boolean ext);

    @JSProperty
    @Nullable
    String getK();

    @JSProperty
    void setK(String k);

    @JSProperty
    @Nullable
    String[] getKey_ops();

    @JSProperty
    void setKey_ops(@JSByRef String... key_ops);

    @JSProperty
    @Nullable
    String getKty();

    @JSProperty
    void setKty(String kty);

    @JSProperty
    @Nullable
    String getN();

    @JSProperty
    void setN(String n);

    @JSProperty
    @Nullable
    Array<RsaOtherPrimesInfo> getOth();

    @JSProperty
    void setOth(@JSByRef RsaOtherPrimesInfo... oth);

    @JSProperty
    void setOth(Array<RsaOtherPrimesInfo> oth);

    @JSProperty
    @Nullable
    String getP();

    @JSProperty
    void setP(String p);

    @JSProperty
    @Nullable
    String getQ();

    @JSProperty
    void setQ(String q);

    @JSProperty
    @Nullable
    String getQi();

    @JSProperty
    void setQi(String qi);

    @JSProperty
    @Nullable
    String getUse();

    @JSProperty
    void setUse(String use);

    @JSProperty
    @Nullable
    String getX();

    @JSProperty
    void setX(String x);

    @JSProperty
    @Nullable
    String getY();

    @JSProperty
    void setY(String y);

}
