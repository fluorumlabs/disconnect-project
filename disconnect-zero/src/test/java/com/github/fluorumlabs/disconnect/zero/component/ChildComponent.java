package com.github.fluorumlabs.disconnect.zero.component;

import com.github.fluorumlabs.disconnect.core.annotations.ImportTemplate;
import com.github.fluorumlabs.disconnect.zero.annotations.CustomElement;

/**
 * Created by Artem Godin on 5/22/2020.
 */
@CustomElement(tagName = "child-component")
@ImportTemplate("disconnect-zero-jar/frontend/child-component.html")
public class ChildComponent extends CustomElementComponent {
}
