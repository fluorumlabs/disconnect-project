package com.github.fluorumlabs.disconnect.vaadin.constants;

import js.extras.JsEnum;

/**
 * Created by Artem Godin on 2/4/2020.
 */
public abstract class CrudEditorPosition extends JsEnum {
	public static final CrudEditorPosition DEFAULT = JsEnum.of("");

	public static final CrudEditorPosition BOTTOM = JsEnum.of("bottom");

	public static final CrudEditorPosition ASIDE = JsEnum.of("aside");

}
