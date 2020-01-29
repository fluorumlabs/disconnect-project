package js.web.console;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface WindowConsole extends Any {
        @JSProperty
        Console getConsole();

        }
