package js.web.webcrypto;

import js.util.buffers.Uint8Array;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;import js.lang.Unknown;


public interface ConcatParams extends Algorithm {
    @JSProperty
    Uint8Array getAlgorithmId();

    @JSProperty
    void setAlgorithmId(Uint8Array algorithmId);

    @JSProperty
    @Nullable
    Unknown getHash();

    @JSProperty
    void setHash(String hash);
    @JSProperty
    void setHash(Algorithm hash);

    @JSProperty
    Uint8Array getPartyUInfo();

    @JSProperty
    void setPartyUInfo(Uint8Array partyUInfo);

    @JSProperty
    Uint8Array getPartyVInfo();

    @JSProperty
    void setPartyVInfo(Uint8Array partyVInfo);

    @JSProperty
    @Nullable
    Uint8Array getPrivateInfo();

    @JSProperty
    void setPrivateInfo(Uint8Array privateInfo);

    @JSProperty
    @Nullable
    Uint8Array getPublicInfo();

    @JSProperty
    void setPublicInfo(Uint8Array publicInfo);

}
