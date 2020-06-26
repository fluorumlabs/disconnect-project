package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* GridItem | null */;
import js.lang.Unknown /* unknown */;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

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

    class Builder {
      private final ActiveItem object = Any.empty();

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
