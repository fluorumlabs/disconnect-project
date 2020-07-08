package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;
import com.github.fluorumlabs.disconnect.core.components.Component;
import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import com.github.fluorumlabs.disconnect.core.components.html.webcomponent.Template;
import js.lang.external.polymer.DomIfElement;

/**
 * The <code>&lt;dom-if&gt;</code> element will stamp a light-dom <code>&lt;template&gt;</code> child when the <code>if</code> property becomes truthy, and the template can use Polymer data-binding and declarative event features when used in the context of a Polymer element's template.
 *
 * When <code>if</code> becomes falsy, the stamped content is hidden but not removed from dom. When <code>if</code> subsequently becomes truthy again, the content is simply re-shown. This approach is used due to its favorable performance characteristics: the expense of creating template content is paid only once and lazily.
 *
 * Set the <code>restamp</code> property to true to force the stamped content to be created / destroyed when the <code>if</code> condition changes.
 */
@CustomElement(tagName = "dom-if", external = true)
public class DomIf extends HtmlComponent<DomIfElement> {

    public DomIf() {
    }

    public DomIf(String textContent) {
        Template template = new Template();
        template.getContent().add(textContent);
        add(template);
    }

    public DomIf(Component<?>... components) {
        Template template = new Template();
        template.getContent().add(components);
        add(template);
    }

    /**
     * A boolean indicating whether this template should stamp.
     */
    public boolean isIf() {
        return getElement().isIf();
    }

    /**
     * A boolean indicating whether this template should stamp.
     */
    public void setIf(boolean value) {
        getElement().setIf(value);
    }

    /**
     * When true, elements will be removed from DOM and discarded when if becomes false and re-created and added back to the DOM when if becomes true. By default, stamped elements will be hidden but left in the DOM when if becomes false, which is generally results in better performance.
     */
    public boolean isRestamp() {
        return getElement().isRestamp();
    }

    /**
     * When true, elements will be removed from DOM and discarded when if becomes false and re-created and added back to the DOM when if becomes true. By default, stamped elements will be hidden but left in the DOM when if becomes false, which is generally results in better performance.
     */
    public void setRestamp(boolean value) {
        getElement().setRestamp(value);
    }
}
