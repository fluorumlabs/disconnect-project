package js.lang.external.vaadin.vaadin_notification;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.polymer.PolymerElement;
import js.lang.external.vaadin.vaadin_element_mixin.ElementMixin;
import js.lang.external.vaadin.vaadin_themable_mixin.ThemableMixin;
import org.teavm.jso.JSProperty;

/**
 * The container element for all notifications.
 *
 */
@NpmPackage(
    name = "@vaadin/vaadin-notification",
    version = "^1.6.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-notification/vaadin-notification.js"
)
public interface NotificationContainer extends PolymerElement, ThemableMixin, ElementMixin {
  /**
   * True when the container is opened
   *
   */
  @JSProperty("opened")
  boolean getOpened();

  /**
   * True when the container is opened
   *
   */
  @JSProperty("opened")
  void setOpened(boolean value);

  class Builder {
    private final NotificationContainer object = Any.empty();

    public NotificationContainer build() {
      return object;
    }

    /**
     * True when the container is opened
     *
     */
    public Builder opened(boolean value) {
      object.setOpened(value);
      return this;
    }
  }
}
