package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import javax.annotation.Nullable;
import js.lang.Any;
import js.lang.Unknown /* Array < GridItem | null > | null */;
import js.lang.Unknown /* unknown */;
import org.teavm.jso.JSIndexer;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/src/vaadin-grid-selection-mixin.js"
)
public interface SelectionMixin extends Any {
  /**
   * An array that contains the selected items.
   *
   */
  @JSProperty("selectedItems")
  @Nullable
  Unknown /* Array < GridItem | null > | null */ getSelectedItems();

  /**
   * An array that contains the selected items.
   *
   */
  @JSProperty("selectedItems")
  void setSelectedItems(String[] value);

  /**
   * An array that contains the selected items.
   *
   */
  @JSProperty("selectedItems")
  void setSelectedItems(SelectedItems[] value);

  /**
   * Selects the given item.
   *
   * @param item The item object
   *
   */
  void selectItem(SelectItemItem item);

  /**
   * Selects the given item.
   *
   * @param item The item object
   *
   */
  void selectItem(String item);

  /**
   * Deselects the given item if it is already selected.
   *
   * @param item The item object
   *
   */
  void deselectItem(DeselectItemItem item);

  /**
   * Deselects the given item if it is already selected.
   *
   * @param item The item object
   *
   */
  void deselectItem(String item);

  interface SelectedItems extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    class Builder {
      private final SelectedItems object = Any.empty();

      public SelectedItems build() {
        return object;
      }

      public SelectedItems.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface SelectItemItem extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    class Builder {
      private final SelectItemItem object = Any.empty();

      public SelectItemItem build() {
        return object;
      }

      public SelectItemItem.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface DeselectItemItem extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    class Builder {
      private final DeselectItemItem object = Any.empty();

      public DeselectItemItem build() {
        return object;
      }

      public DeselectItemItem.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }
}
