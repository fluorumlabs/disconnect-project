package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.core.annotations.ImportTemplate;
import com.github.fluorumlabs.disconnect.zero.annotations.CustomElement;

/**
 * Created by Artem Godin on 5/22/2020.
 */
@CustomElement(tagName = "parent-component")
@ImportTemplate("disconnect-zero-jar/frontend/parent-component.html")
public class ParentComponent extends CustomElementComponent {
}
