package js.web.fetch;

import js.web.dom.AbortSignal;
import js.web.dom.ReferrerPolicy;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * This Fetch API interface represents a resource request.
 */
public interface Request extends Body {
    @JSBody(script = "return Request.prototype")
    static Request prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "input", script = "return new Request(input)")
    static Request create(Request input) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "input", script = "return new Request(input)")
    static Request create(String input) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"input", "init"}, script = "return new Request(input, init)")
    static Request create(Request input, RequestInit init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"input", "init"}, script = "return new Request(input, init)")
    static Request create(String input, RequestInit init) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching.
     */
    @JSProperty
    RequestCache getCache();

    /**
     * Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL.
     */
    @JSProperty
    RequestCredentials getCredentials();

    /**
     * Returns the kind of resource requested by request, e.g., "document" or "script".
     */
    @JSProperty
    RequestDestination getDestination();

    /**
     * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
     */
    @JSProperty
    Headers getHeaders();

    /**
     * Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI]
     */
    @JSProperty
    String getIntegrity();

    /**
     * Returns a boolean indicating whether or not request is for a history navigation (a.k.a. back-foward navigation).
     */
    @JSProperty
    boolean isIsHistoryNavigation();

    /**
     * Returns a boolean indicating whether or not request is for a reload navigation.
     */
    @JSProperty
    boolean isIsReloadNavigation();

    /**
     * Returns a boolean indicating whether or not request can outlive the global in which it was created.
     */
    @JSProperty
    boolean isKeepalive();

    /**
     * Returns request's HTTP method, which is "GET" by default.
     */
    @JSProperty
    String getMethod();

    /**
     * Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs.
     */
    @JSProperty
    RequestMode getMode();

    /**
     * Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
     */
    @JSProperty
    RequestRedirect getRedirect();

    /**
     * Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "client about" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made.
     */
    @JSProperty
    String getReferrer();

    /**
     * Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer.
     */
    @JSProperty
    ReferrerPolicy getReferrerPolicy();

    /**
     * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
     */
    @JSProperty
    AbortSignal getSignal();

    /**
     * Returns the URL of request as a string.
     */
    @JSProperty
    String getUrl();

    Request clone();

}
