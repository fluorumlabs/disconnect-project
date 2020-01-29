package js.web.mediastreams;

import js.lang.Any;
import js.lang.Unknown;
import js.util.function.AnyKeyConsumer;
import js.util.collections.KeyValue;
import js.util.iterable.IterableIterator;
import js.web.dom.BufferSource;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/** This EncryptedMediaExtensions API interface is a read-only map of media key statuses by key IDs. */
        public interface MediaKeyStatusMap extends IterableIterator<KeyValue<BufferSource, MediaKeyStatus>>, Any {
        @JSProperty
         int getSize();

         Unknown get(BufferSource keyId);
         boolean has(BufferSource keyId);
         void forEach(AnyKeyConsumer<MediaKeyStatus, BufferSource, MediaKeyStatusMap> callbackfn);

         IterableIterator<KeyValue<BufferSource, MediaKeyStatus>> entries();
         IterableIterator<BufferSource> keys();
         IterableIterator<MediaKeyStatus> values();

        @JSBody(script = "return MediaKeyStatusMap.prototype")
        static MediaKeyStatusMap prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new MediaKeyStatusMap()")
        static MediaKeyStatusMap create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
