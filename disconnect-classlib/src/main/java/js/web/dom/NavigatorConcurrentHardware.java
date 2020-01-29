package js.web.dom;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface NavigatorConcurrentHardware extends Any {
        @JSProperty
        int getHardwareConcurrency();

        }
