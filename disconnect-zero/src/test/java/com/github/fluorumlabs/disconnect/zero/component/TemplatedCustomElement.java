package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.core.annotations.ImportStyle;
import com.github.fluorumlabs.disconnect.core.annotations.ImportTemplate;
import com.github.fluorumlabs.disconnect.zero.annotations.CustomElement;

/**
 * Created by Artem Godin on 5/22/2020.
 */
@CustomElement
@ImportTemplate("disconnect-zero-jar/frontend/test-component.html")
@ImportStyle("disconnect-zero-jar/frontend/component-style.scss")
public class TemplatedCustomElement extends CustomElementComponent {
}
