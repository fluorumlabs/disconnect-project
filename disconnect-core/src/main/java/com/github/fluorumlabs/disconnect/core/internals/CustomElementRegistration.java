package com.github.fluorumlabs.disconnect.core.internals;


/**
 * Created by Artem Godin on 5/6/2020.
 */
public interface CustomElementRegistration {
	String getTagName();

	Class<?> getComponentClass();
}
