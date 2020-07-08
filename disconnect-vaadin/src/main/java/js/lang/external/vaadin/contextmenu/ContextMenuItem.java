package js.lang.external.vaadin.contextmenu;

import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface ContextMenuItem extends Any {
    @Nullable
    @JSProperty
    String getText();
    
    @JSProperty
    void setText(String text);

    @Nullable
    @JSProperty
    Unknown getComponent();
    
    @JSProperty
    void setComponent(String component);

    @JSProperty
    void setComponent(HTMLElement component);

    @JSProperty
    boolean getDisabled();

    @JSProperty
    void setDisabled(boolean disabled);

    @JSProperty
    boolean getChecked();

    @JSProperty
    void setChecked(boolean checked);

    @JSProperty
    Array<ContextMenuItem> getChildren();

    @JSProperty
    void setChildren(Array<ContextMenuItem> children);
}
