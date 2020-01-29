package js.web.webcrypto;

import js.util.buffers.Uint8Array;
import org.teavm.jso.JSProperty;


public interface DhImportKeyParams extends Algorithm {
    @JSProperty
    Uint8Array getGenerator();

    @JSProperty
    void setGenerator(Uint8Array generator);

    @JSProperty
    Uint8Array getPrime();

    @JSProperty
    void setPrime(Uint8Array prime);

}
