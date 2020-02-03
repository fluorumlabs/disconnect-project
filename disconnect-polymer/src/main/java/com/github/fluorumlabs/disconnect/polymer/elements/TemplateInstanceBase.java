package com.github.fluorumlabs.disconnect.polymer.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.polymer.elements.mixins.PropertyEffects;
import js.lang.Any;
import js.web.dom.HTMLElement;
import js.web.dom.ParentNode;
import org.teavm.jso.JSProperty;

@Import(
        symbols = "TemplateInstanceBase",
        module = "@polymer/polymer/lib/utils/templatize.js"
)
public interface TemplateInstanceBase extends HTMLElement, PropertyEffects {
    /**
     *
     */
    @JSProperty
    ParentNode getRoot();

    /**
     *
     */
    @JSProperty
    void setRoot(ParentNode root);

    /**
     * Find the parent model of this template instance.  The parent model
     * is either another templatize instance that had option `parentModel: true`,
     * or else the host element.
     */
    @JSProperty
    PropertyEffects getParentModel();

    /**
     * Forwards a host property to this instance.  This method should be
     * called on instances from the `options.forwardHostProp` callback
     * to propagate changes of host properties to each instance.
     * <p>
     * Note this method enqueues the change, which are flushed as a batch.
     *
     * @param prop  Property or path name
     * @param value Value of the property to forward
     */
    void forwardHostProp(String prop, Any value);
}
