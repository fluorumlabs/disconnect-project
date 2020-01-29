package js.web.mediastreams;

import js.lang.Any;
import js.lang.Promise;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This EncryptedMediaExtensions API interface provides access to a Key System for decryption and/or a content protection provider. You can request an instance of this object using the Navigator.requestMediaKeySystemAccess method.
 */
public interface MediaKeySystemAccess extends Any {
    @JSBody(script = "return MediaKeySystemAccess.prototype")
    static MediaKeySystemAccess prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new MediaKeySystemAccess()")
    static MediaKeySystemAccess create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSProperty
    String getKeySystem();

    Promise<MediaKeys> createMediaKeys();

    MediaKeySystemConfiguration getConfiguration();

}
