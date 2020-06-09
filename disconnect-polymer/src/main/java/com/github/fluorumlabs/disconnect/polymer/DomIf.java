package com.github.fluorumlabs.disconnect.polymer;

import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;

/**
 * Created by Artem Godin on 6/8/2020.
 */
@CustomElement(tagName = "dom-if", external = true)
public class DomIf extends PolymerComponent<js.lang.external.polymer.lib.elements.DomIf> {
    /**
     * A boolean indicating whether this template should stamp.
     *
     */
    public boolean getIfValue() {
        return getElement().getIfValue();
    }

    /**
     * A boolean indicating whether this template should stamp.
     *
     * @param value
     */
    public void setIfValue(boolean value) {
        getElement().setIfValue(value);
    }

    /**
     * When true, elements will be removed from DOM and discarded when <code>if</code>
     * becomes false and re-created and added back to the DOM when <code>if</code>
     * becomes true.  By default, stamped elements will be hidden but left
     * in the DOM when <code>if</code> becomes false, which is generally results
     * in better performance.
     *
     */
    public boolean getRestamp() {
        return getElement().getRestamp();
    }

    /**
     * When true, elements will be removed from DOM and discarded when <code>if</code>
     * becomes false and re-created and added back to the DOM when <code>if</code>
     * becomes true.  By default, stamped elements will be hidden but left
     * in the DOM when <code>if</code> becomes false, which is generally results
     * in better performance.
     *
     * @param value
     */
    public void setRestamp(boolean value) {
        getElement().setRestamp(value);
    }

    /**
     * When the global <code>suppressTemplateNotifications</code> setting is used, setting
     * <code>notifyDomChange: true</code> will enable firing <code>dom-change</code> events on this
     * element.
     *
     */
    public boolean getNotifyDomChange() {
        return getElement().getNotifyDomChange();
    }

    /**
     * When the global <code>suppressTemplateNotifications</code> setting is used, setting
     * <code>notifyDomChange: true</code> will enable firing <code>dom-change</code> events on this
     * element.
     *
     * @param value
     */
    public void setNotifyDomChange(boolean value) {
        getElement().setNotifyDomChange(value);
    }

    /**
     * Forces the element to render its content. Normally rendering is
     * asynchronous to a provoking change. This is done for efficiency so
     * that multiple changes trigger only a single render. The render method
     * should be called if, for example, template rendering is required to
     * validate application state.
     *
     */
    public void render() {
        getElement().render();
    }
}
