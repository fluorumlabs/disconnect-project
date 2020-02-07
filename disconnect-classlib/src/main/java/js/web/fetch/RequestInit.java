package js.web.fetch;

import js.lang.Any;
import js.lang.Unknown;
import js.util.StringRecord;
import js.util.buffers.Uint8Array;
import js.web.dom.*;
import js.web.streams.ReadableStream;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface RequestInit extends Any {
    /**
     * A BodyInit object or null to set request's body.
     */
    @JSProperty
    @Nullable
    Unknown getBody();

    @JSProperty
    void setBody(Blob body);

    @JSProperty
    void setBody(BufferSource body);

    @JSProperty
    void setBody(FormData body);

    @JSProperty
    void setBody(URLSearchParams body);

    @JSProperty
    void setBody(ReadableStream<Uint8Array> body);

    @JSProperty
    void setBody(String body);

    /**
     * A string indicating how the request will interact with the browser's cache to set request's cache.
     */
    @JSProperty
    @Nullable
    RequestCache getCache();

    @JSProperty
    void setCache(RequestCache cache);

    /**
     * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
     */
    @JSProperty
    @Nullable
    RequestCredentials getCredentials();

    @JSProperty
    void setCredentials(RequestCredentials credentials);

    /**
     * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
     */
    @JSProperty
    @Nullable
    Unknown getHeaders();

    @JSProperty
    void setHeaders(Headers headers);

    @JSProperty
    void setHeaders(String[]... headers);

    @JSProperty
    void setHeaders(StringRecord headers);

    /**
     * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
     */
    @JSProperty
    @Nullable
    String getIntegrity();

    @JSProperty
    void setIntegrity(String integrity);

    /**
     * A boolean to set request's keepalive.
     */
    @JSProperty
    boolean isKeepalive();

    @JSProperty
    void setKeepalive(boolean keepalive);

    /**
     * A string to set request's method.
     */
    @JSProperty
    @Nullable
    String getMethod();

    @JSProperty
    void setMethod(String method);

    /**
     * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
     */
    @JSProperty
    @Nullable
    RequestMode getMode();

    @JSProperty
    void setMode(RequestMode mode);

    /**
     * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
     */
    @JSProperty
    @Nullable
    RequestRedirect getRedirect();

    @JSProperty
    void setRedirect(RequestRedirect redirect);

    /**
     * A string whose value is a same-origin URL, "client about", or the empty string, to set request's referrer.
     */
    @JSProperty
    @Nullable
    String getReferrer();

    @JSProperty
    void setReferrer(String referrer);

    /**
     * A referrer policy to set request's referrerPolicy.
     */
    @JSProperty
    @Nullable
    ReferrerPolicy getReferrerPolicy();

    @JSProperty
    void setReferrerPolicy(ReferrerPolicy referrerPolicy);

    /**
     * An AbortSignal to set request's signal.
     */
    @JSProperty
    @Nullable
    AbortSignal getSignal();

    @JSProperty
    void setSignal(AbortSignal signal);

    /**
     * Can only be null. Used to disassociate request from any Window.
     */
    @JSProperty
    @Nullable
    Any getWindow();

    @JSProperty
    void setWindow(Any window);

}
