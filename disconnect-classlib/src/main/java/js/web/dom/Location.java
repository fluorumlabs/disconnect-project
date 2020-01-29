package js.web.dom;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSProperty;

import js.lang.Any;

/** The location (URL) of the object it is linked to. Changes done on it are reflected on the object it relates to. Both the Document and Window interface have such a linked Location, accessible via Document.location and Window.location respectively. */
        public interface Location extends Any {
        /**
         * Returns a DOMStringList object listing the origins of the ancestor browsing contexts, from the parent browsing context to the top-level browsing context.
         */
        @JSProperty
        DOMStringList getAncestorOrigins();

        /**
         * Returns the Location object's URL's fragment (includes leading "#" if non-empty).
         *
         * Can be set, to navigate to the same URL with a changed fragment (ignores leading "#").
         */
        @JSProperty
        String getHash();

        @JSProperty
        void setHash(String hash);

        /**
         * Returns the Location object's URL's host and port (if different from the default port for the scheme).
         *
         * Can be set, to navigate to the same URL with a changed host and port.
         */
        @JSProperty
        String getHost();

        @JSProperty
        void setHost(String host);

        /**
         * Returns the Location object's URL's host.
         *
         * Can be set, to navigate to the same URL with a changed host.
         */
        @JSProperty
        String getHostname();

        @JSProperty
        void setHostname(String hostname);

        /**
         * Returns the Location object's URL.
         *
         * Can be set, to navigate to the given URL.
         */
        @JSProperty
        String getHref();

        @JSProperty
        void setHref(String href);

        /**
         * Returns the Location object's URL's origin.
         */
        @JSProperty
        String getOrigin();

        /**
         * Returns the Location object's URL's path.
         *
         * Can be set, to navigate to the same URL with a changed path.
         */
        @JSProperty
        String getPathname();

        @JSProperty
        void setPathname(String pathname);

        /**
         * Returns the Location object's URL's port.
         *
         * Can be set, to navigate to the same URL with a changed port.
         */
        @JSProperty
        String getPort();

        @JSProperty
        void setPort(String port);

        /**
         * Returns the Location object's URL's scheme.
         *
         * Can be set, to navigate to the same URL with a changed scheme.
         */
        @JSProperty
        String getProtocol();

        @JSProperty
        void setProtocol(String protocol);

        /**
         * Returns the Location object's URL's query (includes leading "?" if non-empty).
         *
         * Can be set, to navigate to the same URL with a changed query (ignores leading "?").
         */
        @JSProperty
        String getSearch();

        @JSProperty
        void setSearch(String search);

        /**
         * Navigates to the given URL.
         */
        void assign(String url);
        /**
         * Reloads the current page.
         */
        void reload();
        @Deprecated
        void reload(boolean forcedReload);
        /**
         * Removes the current page from the session history and navigates to the given URL.
         */
        void replace(String url);

        @JSBody(script = "return Location.prototype")
        static Location prototype() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        @JSBody(script = "return new Location()")
        static Location create() {
            throw new UnsupportedOperationException("Available only in JavaScript");
        }

        }
