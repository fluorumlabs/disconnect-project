package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.annotations.ImportStyle;
import com.github.fluorumlabs.disconnect.core.annotations.ImportTemplate;

/**
 * Created by Artem Godin on 5/22/2020.
 */
@CustomElement
@ImportTemplate("disconnect-core-jar/frontend/test-component.html")
@ImportStyle("disconnect-core-jar/frontend/component-style.scss")
public class TemplatedCustomElement extends CustomElementComponent {
}
