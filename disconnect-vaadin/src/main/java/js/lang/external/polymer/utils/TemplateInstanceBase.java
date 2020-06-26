package js.lang.external.polymer.utils;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.polymer.StampedTemplate;
import js.lang.external.polymer.mixins.PropertyEffects;
import js.web.dom.Event;
import js.web.dom.HTMLElement;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/utils/templatize.js"
)
public interface TemplateInstanceBase extends PropertyEffects, HTMLElement {
  @JSProperty("root")
  StampedTemplate getRoot();

  @JSProperty("root")
  void setRoot(StampedTemplate value);

  @JSProperty("children")
  void setChildren(Any value);

  /**
   * Find the parent model of this template instance.  The parent model
   * is either another templatize instance that had option <code>parentModel: true</code>,
   * or else the host element.
   *
   */
  @JSProperty("parentModel")
  PropertyEffects getParentModel();

  /**
   * Forwards a host property to this instance.  This method should be
   * called on instances from the <code>options.forwardHostProp</code> callback
   * to propagate changes of host properties to each instance.
   *
   * Note this method enqueues the change, which are flushed as a batch.
   *
   * @param prop Property or path name
   * @param value Value of the property to forward
   *
   */
  void forwardHostProp(String prop, Any value);

  /**
   * Stub of HTMLElement's <code>dispatchEvent</code>, so that effects that may
   * dispatch events safely no-op.
   *
   * @param event Event to dispatch
   * @return Always true.
   *
   */
  boolean dispatchEvent(@Nullable Event event);

  /**
   * Stub of HTMLElement's <code>dispatchEvent</code>, so that effects that may
   * dispatch events safely no-op.
   *
   * @return Always true.
   *
   */
  boolean dispatchEvent();
}
