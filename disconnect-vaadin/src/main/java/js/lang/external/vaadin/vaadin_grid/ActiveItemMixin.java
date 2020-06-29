package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-active-item-mixin.js"
)
public interface ActiveItemMixin extends Any {
  /**
   * The item user has last interacted with. Turns to <code>null</code> after user deactivates
   * the item by re-interacting with the currently active item.
   *
   */
  @JSProperty("activeItem")
  @Nullable
  Unknown /* GridItem | null */ getActiveItem();

  /**
   * The item user has last interacted with. Turns to <code>null</code> after user deactivates
   * the item by re-interacting with the currently active item.
   *
   */
  @JSProperty("activeItem")
  void setActiveItem(@Nullable ActiveItem value);

  /**
   * The item user has last interacted with. Turns to <code>null</code> after user deactivates
   * the item by re-interacting with the currently active item.
   *
   */
  @JSProperty("activeItem")
  void setActiveItem(@Nullable String value);

  void ready();

  interface ActiveItem extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    static ActiveItem.Builder builder() {
      return new ActiveItem.Builder();
    }

    final class Builder {
      private final ActiveItem object = Any.empty();

      private Builder() {
      }

      public ActiveItem build() {
        return object;
      }

      public ActiveItem.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }
}
