package js.web.dom;

import js.lang.Any;


public interface NavigatorContentUtils extends Any {
    void registerProtocolHandler(String scheme, String url, String title);

    void unregisterProtocolHandler(String scheme, String url);
}
