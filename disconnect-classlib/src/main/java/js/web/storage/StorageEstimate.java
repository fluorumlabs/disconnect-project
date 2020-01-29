package js.web.storage;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface StorageEstimate extends Any {
    @JSProperty
    int getQuota();

    @JSProperty
    void setQuota(int quota);

    @JSProperty
    int getUsage();

    @JSProperty
    void setUsage(int usage);

}
