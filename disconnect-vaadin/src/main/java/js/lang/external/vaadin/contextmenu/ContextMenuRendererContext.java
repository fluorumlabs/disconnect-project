package js.lang.external.vaadin.contextmenu;

import js.lang.Any;
import js.lang.Unknown;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

/**
 * Created by Artem Godin on 7/2/2020.
 */
public interface ContextMenuRendererContext extends Any {
    @JSProperty
    HTMLElement getTarget();

    @Nullable
    @JSProperty
    Unknown getDetail();
}
