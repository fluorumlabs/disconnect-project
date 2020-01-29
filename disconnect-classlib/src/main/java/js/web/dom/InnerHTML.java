package js.web.dom;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface InnerHTML extends Any {
        @JSProperty
        String getInnerHTML();

        @JSProperty
        void setInnerHTML(String innerHTML);

        }
