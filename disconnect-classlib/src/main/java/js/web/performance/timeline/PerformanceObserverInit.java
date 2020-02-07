package js.web.performance.timeline;

import js.lang.Any;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface PerformanceObserverInit extends Any {
    @JSProperty
    boolean isBuffered();

    @JSProperty
    void setBuffered(boolean buffered);

    @JSProperty
    @Nullable
    String[] getEntryTypes();

    @JSProperty
    void setEntryTypes(String[] entryTypes);

    @JSProperty
    @Nullable
    String getType();

    @JSProperty
    void setType(String type);

}
