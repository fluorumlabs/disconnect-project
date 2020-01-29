package js.web.canvas;

import js.lang.Any;
import org.teavm.jso.JSProperty;


public interface CanvasFilters extends Any {
    @JSProperty
    String getFilter();

    @JSProperty
    void setFilter(String filter);

}
