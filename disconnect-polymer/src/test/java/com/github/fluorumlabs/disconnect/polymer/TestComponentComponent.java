package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.annotations.ImportTemplate;
import com.github.fluorumlabs.disconnect.core.components.LightDomCustomElementComponent;

/**
 * Created by Artem Godin on 5/22/2020.
 */
@CustomElement(tagName = "test-component")
@ImportTemplate("disconnect-polymer-jar/frontend/domif-test.html")
public class TestComponentComponent extends LightDomCustomElementComponent {
    public void hide() {
        getRoot().find("dom-if").ifPresent(e -> e.removeAttribute("if"));
    }
}
