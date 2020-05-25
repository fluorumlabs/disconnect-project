package com.github.fluorumlabs.disconnect.zero.internals;

import com.github.fluorumlabs.disconnect.zero.component.CustomElementComponent;

/**
 * Created by Artem Godin on 5/6/2020.
 */
public interface CustomElementRegistration {
	String getTagName();

	Class<? extends CustomElementComponent> getComponentClass();
}
