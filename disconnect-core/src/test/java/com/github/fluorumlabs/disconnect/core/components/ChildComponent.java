package com.github.fluorumlabs.disconnect.core.components;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.annotations.ImportTemplate;

/**
 * Created by Artem Godin on 5/22/2020.
 */
@CustomElement(tagName = "child-component")
@ImportTemplate("disconnect-core-jar/frontend/child-component.html")
public class ChildComponent extends CustomElementComponent {
}
