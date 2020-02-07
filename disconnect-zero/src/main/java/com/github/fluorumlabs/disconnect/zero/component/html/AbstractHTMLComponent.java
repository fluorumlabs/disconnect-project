package com.github.fluorumlabs.disconnect.zero.component.html;

import com.github.fluorumlabs.disconnect.zero.component.AbstractComponent;
import js.web.dom.HTMLElement;


public class AbstractHTMLComponent<E extends HTMLElement, T extends AbstractHTMLComponent<E, T>>
		extends AbstractComponent<E>
{

	protected AbstractHTMLComponent(String tagName) {
		super(tagName);
	}
}
