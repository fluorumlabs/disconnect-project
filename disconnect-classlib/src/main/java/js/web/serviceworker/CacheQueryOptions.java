package js.web.serviceworker;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface CacheQueryOptions extends Any {
    @JSProperty
    boolean isIgnoreMethod();

    @JSProperty
    void setIgnoreMethod(boolean ignoreMethod);

    @JSProperty
    boolean isIgnoreSearch();

    @JSProperty
    void setIgnoreSearch(boolean ignoreSearch);

    @JSProperty
    boolean isIgnoreVary();

    @JSProperty
    void setIgnoreVary(boolean ignoreVary);

}
