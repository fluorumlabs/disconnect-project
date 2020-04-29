package js.web.webworkers;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The location (URL) of the object it is linked to. Changes done on it are reflected on the object it relates to. Both the Document and Window interface have such a linked Location, accessible via Document.location and Window.location respectively.
 */
public interface WorkerLocation extends Any {
    @JSBody(script = "return WorkerLocation.prototype")
    static WorkerLocation prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(script = "return new WorkerLocation()")
    static WorkerLocation create() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    /**
     * Returns the Location object's URL's fragment (includes leading "#" if non-empty).
     * <p>
     * Can be set, to navigate to the same URL with a changed fragment (ignores leading "#").
     */
    @JSProperty
    String getHash();

    /**
     * Returns the Location object's URL's host and port (if different from the default port for the scheme).
     * <p>
     * Can be set, to navigate to the same URL with a changed host and port.
     */
    @JSProperty
    String getHost();

    /**
     * Returns the Location object's URL's host.
     * <p>
     * Can be set, to navigate to the same URL with a changed host.
     */
    @JSProperty
    String getHostname();

    /**
     * Returns the Location object's URL.
     * <p>
     * Can be set, to navigate to the given URL.
     */
    @JSProperty
    String getHref();

    /**
     * Returns the Location object's URL's origin.
     */
    @JSProperty
    String getOrigin();

    /**
     * Returns the Location object's URL's path.
     * <p>
     * Can be set, to navigate to the same URL with a changed path.
     */
    @JSProperty
    String getPathname();

    /**
     * Returns the Location object's URL's port.
     * <p>
     * Can be set, to navigate to the same URL with a changed port.
     */
    @JSProperty
    String getPort();

    /**
     * Returns the Location object's URL's scheme.
     * <p>
     * Can be set, to navigate to the same URL with a changed scheme.
     */
    @JSProperty
    String getProtocol();

    /**
     * Returns the Location object's URL's query (includes leading "?" if non-empty).
     * <p>
     * Can be set, to navigate to the same URL with a changed query (ignores leading "?").
     */
    @JSProperty
    String getSearch();
}
