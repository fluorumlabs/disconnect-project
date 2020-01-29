package js.web.mediastreams;

import js.lang.Any;
import js.lang.BooleanPromise;
import js.web.dom.BufferSource;
import org.teavm.jso.JSBody;

/**
 * This EncryptedMediaExtensions API interface the represents a set of keys that an associated HTMLMediaElement can use for decryption of media data during playback.
 */
public interface MediaKeys extends Any {
    @JSBody(script = "return MediaKeys.prototype")
    static MediaKeys prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MediaKeys()")
    static MediaKeys create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    MediaKeySession createSession(MediaKeySessionType sessionType);

    MediaKeySession createSession();

    BooleanPromise setServerCertificate(BufferSource serverCertificate);

}
