package js.lang.external.vaadin;

import js.lang.Any;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

/**
 * Created by Artem Godin on 7/2/2020.
 */
@JSFunctor
@FunctionalInterface
public interface RendererWithContext<E extends HTMLElement, C extends Any> extends JSObject {
    void render(HTMLElement root, E element, C context);
}
