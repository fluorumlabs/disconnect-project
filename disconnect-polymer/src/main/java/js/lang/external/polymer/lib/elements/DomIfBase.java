package js.lang.external.polymer.lib.elements;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.external.polymer.PolymerElement;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@polymer/polymer",
    version = "^3.4.1"
)
@Import(
    module = "@polymer/polymer/lib/elements/dom-if.js"
)
public interface DomIfBase extends PolymerElement {
  /**
   * A boolean indicating whether this template should stamp.
   *
   */
  @JSProperty("if")
  boolean getIfValue();

  /**
   * A boolean indicating whether this template should stamp.
   *
   */
  @JSProperty("if")
  void setIfValue(boolean value);

  /**
   * When true, elements will be removed from DOM and discarded when <code>if</code>
   * becomes false and re-created and added back to the DOM when <code>if</code>
   * becomes true.  By default, stamped elements will be hidden but left
   * in the DOM when <code>if</code> becomes false, which is generally results
   * in better performance.
   *
   */
  @JSProperty("restamp")
  boolean getRestamp();

  /**
   * When true, elements will be removed from DOM and discarded when <code>if</code>
   * becomes false and re-created and added back to the DOM when <code>if</code>
   * becomes true.  By default, stamped elements will be hidden but left
   * in the DOM when <code>if</code> becomes false, which is generally results
   * in better performance.
   *
   */
  @JSProperty("restamp")
  void setRestamp(boolean value);

  /**
   * When the global <code>suppressTemplateNotifications</code> setting is used, setting
   * <code>notifyDomChange: true</code> will enable firing <code>dom-change</code> events on this
   * element.
   *
   */
  @JSProperty("notifyDomChange")
  boolean getNotifyDomChange();

  /**
   * When the global <code>suppressTemplateNotifications</code> setting is used, setting
   * <code>notifyDomChange: true</code> will enable firing <code>dom-change</code> events on this
   * element.
   *
   */
  @JSProperty("notifyDomChange")
  void setNotifyDomChange(boolean value);

  void connectedCallback();

  void disconnectedCallback();

  /**
   * Forces the element to render its content. Normally rendering is
   * asynchronous to a provoking change. This is done for efficiency so
   * that multiple changes trigger only a single render. The render method
   * should be called if, for example, template rendering is required to
   * validate application state.
   *
   */
  void render();
}
