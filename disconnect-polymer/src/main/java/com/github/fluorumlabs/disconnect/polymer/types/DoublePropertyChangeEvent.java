package com.github.fluorumlabs.disconnect.polymer.types;

import js.lang.Any;
import js.web.dom.CustomEvent;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface DoublePropertyChangeEvent extends CustomEvent<DoublePropertyChangeEvent.Details> {
    /**
     * Created by Artem Godin on 2/3/2020.
     */
    interface Details extends Any {
        @JSProperty
        double getValue();
    
        @JSProperty
        void setValue(double value);
    
        @JSProperty
        boolean getQueueProperty();
    
        @JSProperty
        void setQueueProperty(boolean queueProperty);
    
        @JSProperty
        String getPath();
    
        @JSProperty
        void setPath(String path);
    }
}
