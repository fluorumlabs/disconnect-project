package js.lang;

import org.teavm.jso.JSProperty;


public interface PropertyDescriptor extends Any {
    @JSProperty
    boolean isConfigurable();

    @JSProperty
    void setConfigurable(boolean value);

    @JSProperty
    boolean isEnumerable();

    @JSProperty
    void setEnumerable(boolean value);

    @JSProperty
    Any getValue();

    @JSProperty
    void setValue(Any value);

    @JSProperty
    boolean isWritable();

    @JSProperty
    void setWritable();

    Any get();

    void set(Any v);
}
