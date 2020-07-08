package js.lang.external.vaadin.formlayout;

import js.lang.Any;
import org.teavm.jso.JSProperty;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface FormLayoutResponsiveStep extends Any {
    @JSProperty
    String getMinWidth();
    
    @JSProperty
    void setMinWidth(String minWidth);

    @JSProperty
    int getColumns();
    
    @JSProperty
    void setColumns(int columns);

    @JSProperty
    String getLabelsPosition(); // aside/top
    
    @JSProperty
    void setLabelsPosition(String labelsPosition);
}
