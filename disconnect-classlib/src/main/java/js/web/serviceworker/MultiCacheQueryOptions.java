package js.web.serviceworker;


import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface MultiCacheQueryOptions extends CacheQueryOptions {
    @JSProperty
    @Nullable
    String getCacheName();

    @JSProperty
    void setCacheName(String cacheName);

}
