package com.github.fluorumlabs.disconnect.vaadin.renderers;

import js.lang.Any;
import js.lang.Unknown;
import js.util.Record;
import js.web.dom.Element;
import org.teavm.jso.JSFunctor;

/**
 * Created by Artem Godin on 2/4/2020.
 */
@JSFunctor
@FunctionalInterface
public interface OverlayRenderer extends Any {
	void render(Element root, Element owner, Record<Unknown> model);
}
