package js.web.streams;

import js.lang.Any;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


public interface QueuingStrategy<T extends Any> {
    @JSProperty
    int getHighWaterMark();

    @JSProperty
    void setHighWaterMark(int highWaterMark);

    @JSProperty
    @Nullable
    QueuingStrategySizeCallback<T> getSize();

    @JSProperty
    void setSize(QueuingStrategySizeCallback<T> size);
}
