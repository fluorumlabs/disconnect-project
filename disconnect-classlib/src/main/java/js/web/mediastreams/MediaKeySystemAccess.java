package js.web.mediastreams;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;
import js.lang.Promise;

/** This EncryptedMediaExtensions API interface provides access to a Key System for decryption and/or a content protection provider. You can request an instance of this object using the Navigator.requestMediaKeySystemAccess method. */
        public interface MediaKeySystemAccess extends Any {
        @JSProperty
        String getKeySystem();

        Promise<MediaKeys> createMediaKeys();
        MediaKeySystemConfiguration getConfiguration();

        @JSBody(script = "return MediaKeySystemAccess.prototype")
        static MediaKeySystemAccess prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new MediaKeySystemAccess()")
        static MediaKeySystemAccess create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
