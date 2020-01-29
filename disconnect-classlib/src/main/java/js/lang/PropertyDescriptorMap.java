package js.lang;

import org.teavm.jso.JSIndexer;


public interface PropertyDescriptorMap extends Any {
    @JSIndexer
    PropertyDescriptor get(String s);

    @JSIndexer
    void set(String s, PropertyDescriptor value);
}
