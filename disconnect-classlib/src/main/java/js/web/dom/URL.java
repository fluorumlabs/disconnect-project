package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

/**
 * The URL interface represents an object providing static methods used for creating object URLs.
 */
public interface URL extends Any {
    @JSBody(script = "return URL.prototype")
    static URL prototype() {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "url", script = "return new URL(url)")
    static URL create(String url) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"url", "base"}, script = "return new URL(url, base)")
    static URL create(String url, String base) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = {"url", "base"}, script = "return new URL(url, base)")
    static URL create(String url, URL base) {
        throw new UnsupportedOperationException("Available only in JavaScript");
    }

    @JSBody(params = "object", script = "return URL.createObjectURL(object)")
    static String createObjectURL(Any object) {
        throw new UnsupportedOperationException("Available only in JavaScript");

    }

    @JSBody(script = "URL.revokeObjectURL(url)")
    static void revokeObjectURL(String url) {
        throw new UnsupportedOperationException("Available only in JavaScript");

    }

    @JSProperty
    String getHash();

    @JSProperty
    void setHash(String hash);

    @JSProperty
    String getHost();

    @JSProperty
    void setHost(String host);

    @JSProperty
    String getHostname();

    @JSProperty
    void setHostname(String hostname);

    @JSProperty
    String getHref();

    @JSProperty
    void setHref(String href);

    @JSProperty
    String getOrigin();

    @JSProperty
    String getPassword();

    @JSProperty
    void setPassword(String password);

    @JSProperty
    String getPathname();

    @JSProperty
    void setPathname(String pathname);

    @JSProperty
    String getPort();

    @JSProperty
    void setPort(String port);

    @JSProperty
    String getProtocol();

    @JSProperty
    void setProtocol(String protocol);

    @JSProperty
    String getSearch();

    @JSProperty
    void setSearch(String search);

    @JSProperty
    URLSearchParams getSearchParams();

    @JSProperty
    String getUsername();

    @JSProperty
    void setUsername(String username);

    String toJSON();
}
