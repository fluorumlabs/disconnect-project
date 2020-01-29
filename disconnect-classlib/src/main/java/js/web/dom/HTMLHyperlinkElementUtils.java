package js.web.dom;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface HTMLHyperlinkElementUtils extends Any {
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
    String getUsername();

    @JSProperty
    void setUsername(String username);

}
