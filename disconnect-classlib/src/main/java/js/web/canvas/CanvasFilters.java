package js.web.canvas;

import org.teavm.jso.JSProperty;

import js.lang.Any;


public interface CanvasFilters extends Any {
    @JSProperty
    String getFilter();

    @JSProperty
    void setFilter(String filter);

}
