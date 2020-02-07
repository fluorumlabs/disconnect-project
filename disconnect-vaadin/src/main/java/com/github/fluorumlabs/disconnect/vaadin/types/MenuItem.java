package com.github.fluorumlabs.disconnect.vaadin.types;

import js.lang.Any;
import js.lang.Unknown;
import js.util.collections.Array;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;


/**
 * Created by Artem Godin on 2/4/2020.
 */
public interface MenuItem extends Any {
	/**
	 * Text to be set as the menu item component's textContent
	 */
	@Nullable
	@JSProperty
	String getText();

	/**
	 * Text to be set as the menu item component's textContent
	 */
	@JSProperty
	void setText(String text);

	/**
	 * The component to represent the item.
	 */
	@Nullable
	@JSProperty
	Unknown getComponent();

	/**
	 * The component to represent the item.
	 */
	@JSProperty
	void setComponent(Unknown component);

	/**
	 * If true, the item is disabled and cannot be selected
	 */
	@JSProperty
	boolean getDisabled();

	/**
	 * If true, the item is disabled and cannot be selected
	 */
	@JSProperty
	void setDisabled(boolean disabled);

	/**
	 * If true, the item shows a checkmark next to it
	 */
	@JSProperty
	boolean getChecked();

	/**
	 * If true, the item shows a checkmark next to it
	 */
	@JSProperty
	void setChecked(boolean checked);

	/**
	 * Array of child menu items
	 */
	@Nullable
	@JSProperty
	MenuItem[] getChildren();

	/**
	 * Array of child menu items
	 */
	@JSProperty
	void setChildren(MenuItem... children);

	@JSProperty
	void setChildren(Array<MenuItem> children);
}
