package com.github.fluorumlabs.disconnect.core.internals;


import com.github.fluorumlabs.disconnect.core.components.CustomElementComponent;

/**
 * Created by Artem Godin on 5/6/2020.
 */
public interface CustomElementRegistration {
	String getTagName();

	Class<? extends CustomElementComponent> getComponentClass();
}
