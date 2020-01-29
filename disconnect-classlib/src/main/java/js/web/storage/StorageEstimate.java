package js.web.storage;

import js.lang.Any;
import org.teavm.jso.JSProperty;


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
