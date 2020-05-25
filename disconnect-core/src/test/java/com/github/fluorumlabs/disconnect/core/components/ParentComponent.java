package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.annotations.ImportTemplate;

/**
 * Created by Artem Godin on 5/22/2020.
 */
@CustomElement(tagName = "parent-component")
@ImportTemplate("disconnect-core-jar/frontend/parent-component.html")
public class ParentComponent extends CustomElementComponent {
}
