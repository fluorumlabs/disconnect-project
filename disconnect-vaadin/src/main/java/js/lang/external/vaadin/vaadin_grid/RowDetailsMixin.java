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
    module = "@vaadin/vaadin-grid/src/vaadin-grid-row-details-mixin.js"
)
public interface RowDetailsMixin extends Any {
  /**
   * An array containing references to items with open row details.
   *
   */
  @JSProperty("detailsOpenedItems")
  @Nullable
  Unknown /* Array < GridItem | null > | null | undefined */ getDetailsOpenedItems();

  /**
   * An array containing references to items with open row details.
   *
   */
  @JSProperty("detailsOpenedItems")
  void setDetailsOpenedItems(DetailsOpenedItems... value);

  /**
   * An array containing references to items with open row details.
   *
   */
  @JSProperty("detailsOpenedItems")
  void setDetailsOpenedItems(String... value);

  /**
   * Custom function for rendering the content of the row details.
   * Receives three arguments:
   *
   * <ul>
   * <li><code>root</code> The row details content DOM element. Append your content to it.</li>
   * <li><code>grid</code> The <code>&lt;vaadin-grid&gt;</code> element.</li>
   * <li><code>model</code> The object with the properties related with
   * the rendered item, contains:
   * <ul>
   * <li><code>model.index</code> The index of the item.</li>
   * <li><code>model.item</code> The item.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("rowDetailsRenderer")
  @Nullable
  GridRowDetailsRenderer getRowDetailsRenderer();

  /**
   * Custom function for rendering the content of the row details.
   * Receives three arguments:
   *
   * <ul>
   * <li><code>root</code> The row details content DOM element. Append your content to it.</li>
   * <li><code>grid</code> The <code>&lt;vaadin-grid&gt;</code> element.</li>
   * <li><code>model</code> The object with the properties related with
   * the rendered item, contains:
   * <ul>
   * <li><code>model.index</code> The index of the item.</li>
   * <li><code>model.item</code> The item.</li>
   * </ul>
   * </li>
   * </ul>
   */
  @JSProperty("rowDetailsRenderer")
  void setRowDetailsRenderer(@Nullable GridRowDetailsRenderer value);

  /**
   * Open the details row of a given item.
   *
   */
  void openItemDetails(OpenItemDetailsItem item);

  /**
   * Open the details row of a given item.
   *
   */
  void openItemDetails(String item);

  /**
   * Close the details row of a given item.
   *
   */
  void closeItemDetails(CloseItemDetailsItem item);

  /**
   * Close the details row of a given item.
   *
   */
  void closeItemDetails(String item);

  interface DetailsOpenedItems extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    static DetailsOpenedItems.Builder builder() {
      return new DetailsOpenedItems.Builder();
    }

    final class Builder {
      private final DetailsOpenedItems object = Any.empty();

      private Builder() {
      }

      public DetailsOpenedItems build() {
        return object;
      }

      public DetailsOpenedItems.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface OpenItemDetailsItem extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    static OpenItemDetailsItem.Builder builder() {
      return new OpenItemDetailsItem.Builder();
    }

    final class Builder {
      private final OpenItemDetailsItem object = Any.empty();

      private Builder() {
      }

      public OpenItemDetailsItem build() {
        return object;
      }

      public OpenItemDetailsItem.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }

  interface CloseItemDetailsItem extends Any {
    @JSIndexer
    Unknown /* unknown */ get(String key);

    @JSIndexer
    void set(String key, Unknown /* unknown */ value);

    static CloseItemDetailsItem.Builder builder() {
      return new CloseItemDetailsItem.Builder();
    }

    final class Builder {
      private final CloseItemDetailsItem object = Any.empty();

      private Builder() {
      }

      public CloseItemDetailsItem build() {
        return object;
      }

      public CloseItemDetailsItem.Builder set(String key, Unknown /* unknown */ value) {
        object.set(key, value);
        return this;
      }
    }
  }
}
