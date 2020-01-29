package js.web.fetch;

import js.lang.Any;
import js.lang.Promise;
import js.lang.StringPromise;
import js.util.buffers.ArrayBuffer;
import js.util.buffers.Uint8Array;
import js.web.dom.Blob;
import js.web.dom.FormData;
import js.web.streams.ReadableStream;
import org.teavm.jso.JSProperty;


public interface Body extends Any {
    @JSProperty
    ReadableStream<Uint8Array> getBody();

    @JSProperty
    boolean isBodyUsed();

    Promise<ArrayBuffer> arrayBuffer();
    Promise<Blob> blob();
    Promise<FormData> formData();
    Promise<Any> json();
    StringPromise text();
}
